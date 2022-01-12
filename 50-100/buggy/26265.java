@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setEmptyText(getResources().getString(R.string.empty_albums));
    setHasOptionsMenu(true);
    mAdapter = new org.xbmc.android.remotesandbox.ui.AlbumsFragment.AlbumsAdapter(getActivity());
    setListAdapter(mAdapter);
    setListShown(false);
    getLoaderManager().initLoader(0, null, this);
}