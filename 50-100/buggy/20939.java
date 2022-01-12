private void setSpinnerCitiesAdapter(java.util.ArrayList<java.lang.String> cities, android.content.Context c) {
    java.util.List<java.lang.String> tempList = new java.util.ArrayList<>();
    tempList.add(c.getString(R.string.txt_City));
    tempList.addAll(cities);
    android.widget.ArrayAdapter<java.lang.String> citiesAdapter = new android.widget.ArrayAdapter(c, android.R.layout.simple_spinner_dropdown_item, tempList);
    spinnerCities.setAdapter(citiesAdapter);
}