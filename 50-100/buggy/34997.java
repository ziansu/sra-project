public void setCategorySpinner(android.widget.Spinner categorySpinner) {
    this.categorySpinner = categorySpinner;
    this.categorySpinner.setOnItemSelectedListener(categoryListener);
    java.util.List<java.lang.String> categoriesList = new java.util.ArrayList<>();
    for (com.example.albergon.unirank.Model.Enums.PopularIndicatorsCategories category : Enums.PopularIndicatorsCategories.values()) {
        categoriesList.add(category.toString());
    }
    categoriesList.add(0, "not selected");
    android.widget.ArrayAdapter<java.lang.String> categoryAdapter = new android.widget.ArrayAdapter(context, R.layout.cell_simple_dropdown_text, categoriesList);
    this.categorySpinner.setAdapter(categoryAdapter);
}