public void populate(it.ialweb.poi.Station station) {
    if ((collapsingToolbar) != null) {
        collapsingToolbar.setTitle(station.getName());
    }
    text.setVisibility(View.VISIBLE);
    gallery.setVisibility(View.VISIBLE);
    fabButton.setVisibility(View.VISIBLE);
    com.bumptech.glide.Glide.with(getActivity()).load(station.getImageUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).into(image);
}