void recycler_view() {
    mAdapter = new com.voloc.Adapter.RVAdapter(courseList);
    android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity().getApplicationContext());
    recyclerView.setLayoutManager(mLayoutManager);
    recyclerView.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    recyclerView.setAdapter(mAdapter);
    prepareCourseData();
}