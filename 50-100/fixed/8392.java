@java.lang.Override
public void onError(java.lang.Throwable e) {
    super.onError(e);
    showLoading(false);
    java.lang.String errorMessage = com.nairbspace.octoandroid.exception.ErrorMessageFactory.create(mScreen.context(), ((java.lang.Exception) (e)));
    if (com.nairbspace.octoandroid.exception.ErrorMessageFactory.ifSslError(mScreen.context(), ((java.lang.Exception) (e)))) {
        mScreen.showAlertDialog();
    }else {
        mScreen.showSnackbar(errorMessage);
    }
}