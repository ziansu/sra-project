@java.lang.Override
public void onError(java.lang.Throwable e) {
    super.onError(e);
    showLoading(false);
    java.lang.Exception ex = ((java.lang.Exception) (e));
    java.lang.String errorMessage = com.nairbspace.octoandroid.exception.ErrorMessageFactory.create(mScreen.context(), ex);
    if (com.nairbspace.octoandroid.exception.ErrorMessageFactory.ifSslError(mScreen.context(), e.getMessage())) {
        mScreen.showAlertDialog();
    }else {
        mScreen.showSnackbar(errorMessage);
    }
}