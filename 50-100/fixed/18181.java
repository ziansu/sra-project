@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.edit :
            showEditDialog();
            actualQuestionCatalog = null;
            return true;
        case R.id.delete :
            com.bitschupfa.sw16.yaq.database.dao.QuestionCatalogDAO deleteQuestionCatalog = new com.bitschupfa.sw16.yaq.database.dao.QuestionCatalogDAO(actualQuestionCatalog);
            deleteQuestionCatalog.deleteEntry(this);
            updateListView();
            actualQuestionCatalog = null;
            return true;
        default :
            return super.onContextItemSelected(item);
    }
}