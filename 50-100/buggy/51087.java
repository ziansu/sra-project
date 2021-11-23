public void setNoContent(boolean toggleNoContent) {
    if (!toggleNoContent) {
        noContent.setText(outOfNames);
    }else
        if (dataSource.getAllNamesInList(listName).isEmpty()) {
            noContent.setText(noNames);
        }
    
    int viewVisibility = (content.isEmpty()) ? android.view.View.VISIBLE : android.view.View.GONE;
    noContent.setVisibility(viewVisibility);
}