@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    if ((getActivity()) instanceof kamini.app.moviecollection.MovieDetailActivity) {
        inflater.inflate(R.menu.menu_detail, menu);
        finishCreatingMenu(menu);
    }
}