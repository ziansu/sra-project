private void printDatabase(java.lang.String passphrase) {
    java.util.ArrayList<java.lang.String> dbString = dbHandler.databaseToString(passphrase);
    java.lang.String[] arr = new java.lang.String[dbString.size()];
    for (int i = 0; i < (dbString.size()); i++) {
        arr[i] = dbString.get(i);
    }
    accountDisplay.setAdapter(new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_list_item_1, arr));
}