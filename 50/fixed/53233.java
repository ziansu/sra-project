@java.lang.Override
public void fail(java.lang.String errMsg) {
    tvErrorMsg.setText(errMsg);
    progressHolder.hide();
}