private void printDatabase(java.lang.String passphrase) {
    java.util.ArrayList<java.lang.String> dbString = dbHandler.databaseToString(passphrase);
    java.lang.String[] arr = ((java.lang.String[]) (dbString.toArray()));
    accountDisplay.setAdapter(new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_list_item_1, arr));
}