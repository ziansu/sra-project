@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    swipeRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (inflater.inflate(R.layout.fragment_home_most_recent, container, false)));
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (swipeRefreshLayout.findViewById(R.id.recyclerView)));
    setupSwipeRefreshLayout(swipeRefreshLayout, recyclerView);
    setupRecyclerView(recyclerView, container.getContext());
    return swipeRefreshLayout;
}