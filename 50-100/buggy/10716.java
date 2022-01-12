@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    adapter = new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1);
    setEmptyText("No data, please add from menu.");
    setListAdapter(adapter);
    setListShown(false);
    getLoaderManager().initLoader(ch.ronoli.tensing.fragments.CategoryFragment.LOADER_ID, null, this);
    restoreActionBar();
}