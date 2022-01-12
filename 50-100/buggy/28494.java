@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d("CHRIS", ("onCreateView() returned: " + container));
    android.view.View view = inflater.inflate(R.layout.fragment_price, container, false);
    swipeRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (view.findViewById(R.id.swipe_container)));
    swipeRefreshLayout.setOnRefreshListener(this);
    return view;
}