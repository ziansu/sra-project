@java.lang.Override
public void onRefreshFinished(boolean success) {
    hideProgressWheel();
    if (success) {
        mAdapter.notifyDataSetChanged();
        if ((mDetailContainer) != null) {
            insertFragmentIntoDetailContainer(getListManipulator().getItem(0).getSymbol());
        }
    }else {
        if ((getListManipulator().getCount()) == 0) {
            showEmptyWidgets();
        }
    }
    de.greenrobot.event.EventBus.getDefault().removeAllStickyEvents();
}