@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.recycleview_activity_fragment, container, false);
    setViews(rootView);
    sportsNewsList = new java.util.ArrayList<>();
    allSportsAdapter = new com.mikhail.sportsnewshistoryrecords.adapters.AllSportsAdapter();
    setPullRefresh();
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    allSportsAdapterItemClicker();
    return rootView;
}