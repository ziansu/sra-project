private void setupAdapter() {
    if ((isAdded()) && ((mPhotoRecyclerView.getAdapter()) == null))
        mPhotoRecyclerView.setAdapter(new com.example.miljanrakita.photogallery.Fragment.PhotoGalleryFragment.PhotoAdapter(mItems));
    
    mPhotoRecyclerView.getAdapter().notifyDataSetChanged();
}