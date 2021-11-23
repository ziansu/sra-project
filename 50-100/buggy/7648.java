@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_movie_item_details, container, false);
    com.example.inspired.inspiredvideo.utils.MovieViewHolder movieViewHolder = new com.example.inspired.inspiredvideo.utils.MovieViewHolder(view);
    java.lang.System.out.println("here");
    movieViewHolder.getmImageView().setImageResource(mMovieItem.getImageRes());
    movieViewHolder.getmNameView().setText(mMovieItem.getName());
    movieViewHolder.getmTextDescription().setText(mMovieItem.getDescription());
    return view;
}