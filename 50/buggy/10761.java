@java.lang.Override
public void onResume() {
    super.onResume();
    adapter.registerAdapterDataObserver(dataObserver);
    if (shouldReloadOnResume()) {
        setViewState(ViewState.LOADING);
        getListData(this);
    }
}