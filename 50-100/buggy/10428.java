@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    ((com.example.daniel.todule_android.activities.MainActivity) (getActivity())).fabVisibility(false);
    setEmptyText("No entry found");
    mAdapter = new com.example.daniel.todule_android.adapter.HistoryAdapter(getActivity(), null, 0);
    setListAdapter(mAdapter);
    getActivity().getSupportLoaderManager().initLoader(com.example.daniel.todule_android.activities.ToduleHistoryFragment.LOADER_ID, null, this);
}