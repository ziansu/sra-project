@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if ((refreshView) != null) {
        refreshView = view.findViewById(R.id.refresh);
    }
    if ((fetchNextView) != null) {
        fetchNextView = view.findViewById(R.id.fetching_next);
    }
    if ((refreshView) instanceof android.support.v4.widget.SwipeRefreshLayout) {
        ((android.support.v4.widget.SwipeRefreshLayout) (refreshView)).setOnRefreshListener(refreshListener);
    }
}