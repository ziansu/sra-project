@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_movies, container, false);
    gridView = ((android.widget.GridView) (rootView.findViewById(R.id.gridview_movie_list)));
    movieAdapter = new com.manishm.myappportfolio.adapter.MovieAdapter(getActivity(), moviesList);
    gridView.setAdapter(movieAdapter);
    return rootView;
}