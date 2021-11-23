private void createSpinner() {
    java.lang.String[] colorList;
    this.colorSpinner = ((android.widget.Spinner) (findViewById(R.id.options_menu_spinner)));
    colorList = new java.lang.String[]{ this.getString(R.string.color_blue) , this.getString(R.string.color_green) , this.getString(R.string.color_orange) , this.getString(R.string.color_purple) };
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_spinner_item, colorList);
    this.colorSpinner.setAdapter(adapter);
    this.colorSpinner.setOnItemSelectedListener(this);
}