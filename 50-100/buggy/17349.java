public boolean onLongClick(android.view.View v) {
    android.widget.Toast toast;
    com.example.bestnameever.bestappever.Database.insert(1, ("" + (v.getId())));
    toast = android.widget.Toast.makeText(this.getApplicationContext(), ("" + (v.getId())), Toast.LENGTH_LONG);
    toast.show();
}