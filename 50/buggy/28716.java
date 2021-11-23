@java.lang.Override
public void onError(java.lang.Throwable e) {
    hideProgressDialog();
    handleError(e, 0, "");
}