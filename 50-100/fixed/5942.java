@java.lang.Override
protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    if ((com.students.lmi.lmi_app.News.referencelist.size()) != 0) {
        android.content.Intent intent = new android.content.Intent(this, com.students.lmi.lmi_app.CurrentNews.class);
        dialog2 = android.app.ProgressDialog.show(this, "Загрузка", "Подождите, новость загружается...");
        intent.putExtra("reference", com.students.lmi.lmi_app.News.referencelist.get(position));
        startActivity(intent);
    }
    super.onListItemClick(l, v, position, id);
}