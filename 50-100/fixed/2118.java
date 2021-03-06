@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = createRootView(inflater, container, savedInstanceState);
    if (getDataManager().getRefreshEnabled())
        configSwipeRefreshLayout(createSwipeRefreshLayout(rootView));
    
    recyclerView = createRecyclerView(rootView);
    mEmptyView = createEmptyView(rootView);
    onViewCreated(rootView);
    return rootView;
}