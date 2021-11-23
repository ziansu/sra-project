private void initRecyclerView(android.support.v7.widget.RecyclerView recyclerView) {
    observerList.add(recyclerView);
    recyclerView.addOnScrollListener(new ninja.poepoe.library.ScrollListener(observerList));
}