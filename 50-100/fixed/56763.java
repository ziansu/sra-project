@java.lang.Override
public void onResume() {
    super.onResume();
    getActivity().setTitle(R.string.app_name);
    if ((getResources().getConfiguration().orientation) == (android.content.res.Configuration.ORIENTATION_PORTRAIT))
        layoutManager.setSpanCount(COL_SHOWN_IN_PORTRAIT);
    else
        layoutManager.setSpanCount(COL_SHOWN_IN_LANDSCAPE);
    
    if ((moviesAdapter) != null) {
        presenter.fetchMoviesAsync(mContext);
    }
}