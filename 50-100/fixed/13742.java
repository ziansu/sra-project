@java.lang.Override
public void runWith(java.util.List<T> result) {
    if (result == null)
        return ;
    
    listView.setOnItemLongClickListener(new com.lasthopesoftware.bluewater.client.library.items.menu.LongClickViewAnimatorListener());
    listView.setAdapter(new com.lasthopesoftware.bluewater.client.library.items.list.ItemListAdapter(activity, R.id.tvStandard, result, itemListMenuChangeHandler, storedItemAccess, library));
    loadingView.setVisibility(View.INVISIBLE);
    listView.setVisibility(View.VISIBLE);
    if ((position) == 0)
        com.lasthopesoftware.bluewater.client.library.views.handlers.OnGetLibraryViewIItemResultsComplete.buildTutorialView(activity, container, listView);
    
}