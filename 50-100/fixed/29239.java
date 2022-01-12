@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setEmptyText("No entry found");
    mAdapter = new com.example.daniel.todule_android.adapter.MainCursorAdapter(getActivity(), null, 0);
    setListAdapter(mAdapter);
    getActivity().getSupportLoaderManager().initLoader(com.example.daniel.todule_android.activities.ToduleListFragment.LOADER_ID, null, this);
}