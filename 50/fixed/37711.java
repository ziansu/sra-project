@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (e instanceof java.lang.NullPointerException) {
        view.setErrorText();
    }else {
        view.setErrorText(e.getMessage());
    }
}