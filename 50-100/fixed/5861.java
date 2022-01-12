@java.lang.Override
public void onRefreshFinished(com.mcochin.stockstreaks.pojos.events.AppRefreshFinishedEvent event) {
    hideProgressWheel();
    if (event.isSuccessful()) {
        mAdapter.notifyDataSetChanged();
        dynamicLoadMore();
        if ((mDetailContainer) != null) {
            insertFragmentIntoDetailContainer(getListManipulator().getItem(0).getSymbol());
        }
    }else {
        if ((getListManipulator().getCount()) == 0) {
            showEmptyWidgets();
        }
    }
}