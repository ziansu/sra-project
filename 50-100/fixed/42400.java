private void setRecycleView(android.view.View root, com.example.kaveon14.workoutbuddy.Fragments.MainFragments.ProgressPhotosFragment.ProgressPhotoAdapter adapter) {
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (root.findViewById(R.id.photoRecycleView)));
    android.support.v7.widget.RecyclerView.LayoutManager manager = new android.support.v7.widget.GridLayoutManager(getContext(), 2);
    recyclerView.setLayoutManager(manager);
    recyclerView.setItemViewCacheSize(12);
    recyclerView.setHasFixedSize(true);
    recyclerView.setAdapter(adapter);
}