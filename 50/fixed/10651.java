@java.lang.Override
public void onClick(android.view.View view) {
    dbHelper.deleteAllTagsFromDB();
    allTags = dbHelper.getAllTags();
    adapter.updateTags(allTags);
}