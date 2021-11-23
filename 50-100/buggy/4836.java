private void PopulateSpinners() {
    java.lang.Integer[] array = new java.lang.Integer[50];
    for (int i = 0; i < 50; i++) {
        array[i] = i + 1;
    }
    androidexpList.setAdapter(new android.widget.ArrayAdapter<java.lang.Integer>(this, android.R.layout.simple_list_item_1, array));
    iosexpList.setAdapter(new android.widget.ArrayAdapter<java.lang.Integer>(this, android.R.layout.simple_list_item_1, array));
}