@java.lang.Override
protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    android.content.Intent showOrario = new android.content.Intent(this, it.sasabz.android.sasabus.ShowOrariActivity.class);
    showOrario.putExtra("linea", linea);
    showOrario.putExtra("destinazione", destinazione);
    it.sasabz.android.sasabus.classes.Palina palina = ((it.sasabz.android.sasabus.classes.Palina) (list.get(position)));
    showOrario.putExtra("palina", palina.getName_de());
    startActivity(showOrario);
}