@java.lang.Override
public com.daksh.tmdbsample.movielist.MovieListAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    final com.daksh.tmdbsample.databinding.MovieListItemBinding B = android.databinding.DataBindingUtil.inflate(android.view.LayoutInflater.from(parent.getContext()), R.layout.movie_list_item, parent, false);
    B.imagePoster.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            B.imagePoster.getLayoutParams().height = ((int) (((double) (B.imagePoster.getWidth())) * (com.daksh.tmdbsample.movielist.MovieListAdapter.IMAGE_ASPECT_RATIO)));
        }
    });
    return new com.daksh.tmdbsample.movielist.MovieListAdapter.ViewHolder(B, itemClickListener);
}