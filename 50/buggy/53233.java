@java.lang.Override
public void fail(java.lang.String errMsg) {
    tvErrorMsg.setText(errMsg, TextView.BufferType.SPANNABLE);
    progressHolder.hide();
}