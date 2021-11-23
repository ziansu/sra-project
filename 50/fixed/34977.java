private void setupAdapter() {
    if (isAdded())
        mPhotoRecyclerView.setAdapter(new com.example.miljanrakita.photogallery.Fragment.PhotoGalleryFragment.PhotoAdapter(mItems));
    
}