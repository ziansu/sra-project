private void initInstances(android.view.View rootView) {
    daoManager = new com.ssru.mrsmile.apptest.manager.BloggerDaoManager();
    listAdapter = new com.ssru.mrsmile.apptest.adapter.BloggerListAdapter();
    listView = ((android.widget.ListView) (rootView.findViewById(R.id.listView)));
    listView.setAdapter(listAdapter);
    reloadData();
}