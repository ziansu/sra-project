@java.lang.Override
public void onDetach() {
    super.onDetach();
    onMovieSelectedListener = OnMovieSelectedListener.EMPTY;
}