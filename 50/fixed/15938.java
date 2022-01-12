@java.lang.Override
public void onError(java.lang.Throwable e) {
    e.printStackTrace();
    mIBlibiliFragment.hideProgressbar();
    mIBlibiliFragment.showError(e.getMessage());
}