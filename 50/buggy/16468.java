@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    closeDrawer();
    setCurrentTag(id);
    getLoaderManager().restartLoader(com.kos.ktodo.KTodo.CURRENT_TAG_ITEMS_LOADER_ID, null, currentTagItemsLoaderCallbacks);
}