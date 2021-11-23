@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.now_playing_movie_details, container, false);
    tvMovieTitle = ((android.widget.TextView) (view.findViewById(R.id.tv_title)));
    tvGenres = ((android.widget.TextView) (view.findViewById(R.id.tv_genres)));
    tvDescription = ((android.widget.TextView) (view.findViewById(R.id.tv_description)));
    startServerRequest(view);
    return view;
}