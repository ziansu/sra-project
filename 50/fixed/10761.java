@java.lang.Override
public void onResume() {
    super.onResume();
    if (shouldReloadOnResume()) {
        setViewState(ViewState.LOADING);
        getListData(this);
    }
}