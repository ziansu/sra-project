@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    java.lang.String categoryId = categoriesId.get(i);
    android.content.Intent intent = new android.content.Intent(this, ruc.ps_app_project.CategoriesEachActivity.class);
    intent.putExtra("CategoryID", categoryId);
    startActivity(intent);
}