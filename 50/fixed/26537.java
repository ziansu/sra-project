public void setRecyclerViewAdapter() {
    adapter = new ambiesoft.start.utility.RecyclerViewAdapter(ambiesoft.start.fragment.HomeFragment.filteredPerformances, getActivity());
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
}