public static android.widget.ImageView getImage(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    if (holder instanceof com.alexvasilkov.gestures.sample.adapters.FlickrPhotoListAdapter.ViewHolder) {
        return ((com.alexvasilkov.gestures.sample.adapters.FlickrPhotoListAdapter.ViewHolder) (holder)).image;
    }else {
        return null;
    }
}