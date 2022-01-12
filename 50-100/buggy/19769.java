public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(getApplicationContext(), ((android.widget.TextView) (view)).getText(), Toast.LENGTH_SHORT).show();
    dbHandler.loeschenMain(("" + (((android.widget.TextView) (view)).getText())));
    adapter.clear();
    java.util.ArrayList<java.lang.String> resultsUpdate = dbHandler.loeschenAusgabe();
    adapter.notifyDataSetChanged();
}