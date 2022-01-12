private void updateListView() {
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(this, R.layout.simple_row1, R.id.text1, listOfValues);
    listView.setAdapter(adapter);
}