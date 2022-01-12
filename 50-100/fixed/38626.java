@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.monday, container, false);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(R.id.monRecycler)));
    mLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    mRecyclerView.setLayoutManager(mLayoutManager);
    mAdapter = new com.example.harva.scheduler.MyAdapter(getLessons(), getItem(), getTime(), getActivity());
    mRecyclerView.setAdapter(mAdapter);
    return rootView;
}