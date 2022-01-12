private void showCategories() {
    categoryList.clear();
    categories = dbHandler.getAllCategories();
    if (!(categories.isEmpty())) {
        for (com.example.zhuki.outlaytracking.Category c : categories) {
            categoryList.add(c.getCategory());
        }
    }
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categoryList);
    dropdown.setAdapter(adapter);
    dropdown.setSelection(((categories.size()) - 1));
}