public void setNoContent() {
    if (dataSource.getAllNamesInList(listName).isEmpty()) {
        noContent.setText(noNames);
    }else {
        noContent.setText(outOfNames);
    }
    int viewVisibility = (content.isEmpty()) ? android.view.View.VISIBLE : android.view.View.GONE;
    noContent.setVisibility(viewVisibility);
}