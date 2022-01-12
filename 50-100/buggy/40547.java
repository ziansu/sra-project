@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_measuring_station, container, false);
    mListView = ((android.widget.AbsListView) (view.findViewById(R.id.measuring_station_list)));
    mListView.setAdapter(mAdapter);
    mListView.setOnItemClickListener(this);
    mSwipeRefresh = ((android.support.v4.widget.SwipeRefreshLayout) (view.findViewById(R.id.measuring_station_list_swipe_refresh)));
    mSwipeRefresh.setOnRefreshListener(this);
    return view;
}