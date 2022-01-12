@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    final android.view.View v = inflater.inflate(R.layout.fragment_topic, container, false);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (v.findViewById(R.id.rv_thread_view)));
    mRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this.getActivity()));
    populateTopic();
    return v;
}