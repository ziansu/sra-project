private void initUI() {
    com.versatilemobitech.fmc.fragments.GalleryViewFragment.galleryViewModels = null;
    grid_view = ((android.widget.GridView) (rootView.findViewById(R.id.grid_view)));
    grid_view.setNumColumns(3);
    grid_view.setHorizontalSpacing(10);
    grid_view.setVerticalSpacing(10);
    tv_no_images = ((android.widget.TextView) (rootView.findViewById(R.id.tv_no_images)));
    getGalleryFromApi(albumId, "1");
    grid_view.setOnScrollListener(this);
    grid_view.setOnItemClickListener(this);
}