@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_main, null);
    recyclerView = ((com.jude.easyrecyclerview.EasyRecyclerView) (view.findViewById(R.id.easy_recyclerview)));
    recyclerView.setErrorView(R.layout.view_net_error);
    return view;
}