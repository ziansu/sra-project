public void addCategoryInExistClass(java.lang.String title, java.lang.String invoiceNum, java.lang.String listContentTitle) {
    com.example.scott.bonus.gategory.Category category = classHashMap.get(title);
    android.widget.ArrayAdapter adapter = category.getAdapter();
    adapter.add(listContentTitle);
    invoiceNumHashMap.put(adapter.getItem(((adapter.getCount()) - 1)).toString(), invoiceNum);
}