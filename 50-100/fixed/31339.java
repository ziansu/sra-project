private void showUI() {
    if ((recyclerView) != null) {
        recyclerView.setAdapter(new io.github.hkust1516csefyp43.easymed.view.fragment.MedicationVariantListFragment.medicationVariantRecyclerViewAdapter());
        recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
        progressBar.setVisibility(View.GONE);
        swipeRefreshLayout.setVisibility(View.VISIBLE);
        android.content.Context context = getContext();
        if (context != null) {
            dragScrollBar = new com.turingtechnologies.materialscrollbar.DragScrollBar(context, recyclerView, true);
            dragScrollBar.addIndicator(new com.turingtechnologies.materialscrollbar.AlphabetIndicator(getContext()), true);
        }
    }
}