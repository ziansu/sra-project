@java.lang.Override
public void searchItem(java.lang.String query, com.ryanliang.inventorygui.MediaCategory media) {
    if (query != null) {
        query = query.trim();
        searchItemHelper(query, media);
        view.update(UpdateType.SEARCH_RESULT);
    }else
        java.lang.System.out.println("searchItemString query, MediaCategory media) reference is null.");
    
}