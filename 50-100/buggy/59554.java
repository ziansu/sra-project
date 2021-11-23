private void setUpRecyclerView() {
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getContext());
    recyclerView.setLayoutManager(layoutManager);
    recyclerViewAdapter = new com.example.magda.systeminformacyjny.utils.RecyclerViewEventsAdapter(recyclerView, events, true, null, viewModel);
    jp.wasabeef.recyclerview.animators.SlideInRightAnimator itemAnimation = new jp.wasabeef.recyclerview.animators.SlideInRightAnimator(new android.view.animation.AccelerateInterpolator());
    recyclerView.setItemAnimator(itemAnimation);
    layoutManager.scrollToPosition(0);
    recyclerView.setAdapter(recyclerViewAdapter);
}