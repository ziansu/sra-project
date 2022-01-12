private void initializeDraftList(org.fourdnest.androidclient.EggManager manager, android.widget.ListView draftListView) {
    org.fourdnest.androidclient.ui.EggAdapter adapter = new org.fourdnest.androidclient.ui.EggAdapter(draftListView, R.layout.egg_element_draft, manager.listEggs());
    draftListView.setAdapter(adapter);
    ((org.fourdnest.androidclient.ui.EggAdapter) (draftListView.getAdapter())).sort(new org.fourdnest.androidclient.EggTimeComparator());
    ((org.fourdnest.androidclient.ui.EggAdapter) (draftListView.getAdapter())).notifyDataSetChanged();
    draftListView.setOnItemClickListener(new org.fourdnest.androidclient.ui.DraftListOnItemClickListener(draftListView));
}