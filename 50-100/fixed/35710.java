@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelableArrayList(com.jp.popularmoviess1.MainActivity.MOVIE_LIST, movieArrayList);
    com.jp.popularmoviess1.MainActivity.gridViewPosition = gridView.getFirstVisiblePosition();
    outState.putInt(com.jp.popularmoviess1.MainActivity.KEY_SELECTED_POSITION, com.jp.popularmoviess1.MainActivity.gridViewPosition);
    state = gridView.onSaveInstanceState();
    outState.putParcelable("key", state);
}