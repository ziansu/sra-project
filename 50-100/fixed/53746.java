protected void updateList() {
    com.networkmanagerapp.JSONParsingResults results = new com.networkmanagerapp.JSONParser().returnParsedData("/devices.json");
    setItems(results.getItem());
    setListAdapter(new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_list_item_1, results.getNames()));
    lastRefresh.setText(("Refreshed on: " + (new java.util.Date(new java.io.File(((getFilesDir().toString()) + "/devices.json")).lastModified()).toString())));
}