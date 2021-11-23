@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.updates_fragment_layout, container, false);
    swipeLayout = ((android.support.v4.widget.SwipeRefreshLayout) (rootView.findViewById(R.id.swipe_container)));
    swipeLayout.setOnRefreshListener(this);
    swipeLayout.setColorSchemeResources(R.color.redBirdHacksRed, R.color.darkred, R.color.darkred, R.color.white);
    return rootView;
}