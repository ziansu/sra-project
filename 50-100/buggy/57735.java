@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (which != sortChoice) {
        com.nasahapps.awkwardratings.PreferencesHelper.getInstance(getActivity()).putInt(PreferencesHelper.KEY_SORT, which);
        mMovies.clear();
        mRecyclerView.getAdapter().notifyDataSetChanged();
        mRecyclerView.getEmptyView().setVisibility(View.INVISIBLE);
        mRecyclerView.getSwipeToRefresh().setRefreshing(true);
        getMovies();
    }
    dialog.dismiss();
}