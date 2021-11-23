@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_item_list, container, false);
    android.util.Log.d("ResultListFragment", "onCreateView");
    se.anderssjobom.weathertracker.ResultListFragment.mRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.result_recycler_view)));
    se.anderssjobom.weathertracker.ResultListFragment.mRecyclerView.setHasFixedSize(true);
    android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    se.anderssjobom.weathertracker.ResultListFragment.mRecyclerView.setLayoutManager(mLayoutManager);
    return view;
}