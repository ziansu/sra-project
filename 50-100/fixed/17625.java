@java.lang.Override
public void onScrollStateChanged(android.support.v7.widget.RecyclerView recyclerView, int newState) {
    super.onScrollStateChanged(recyclerView, newState);
    if ((newState == (android.support.v7.widget.RecyclerView.SCROLL_STATE_IDLE)) && ((lastVisibleItem) == ((mMainAdapter.getItemCount()) - 1))) {
        timber.log.Timber.d("onScrollStateChanged load more.");
        mPage += 1;
        mMainPresenter.loadGanks(com.sky.gankmm.ui.main.MainActivity.SIZE, mPage, false);
    }
}