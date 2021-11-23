@java.lang.Override
protected void appleStyleAfterCreated(com.taobao.weex.ui.view.WXEditText editText) {
    super.appleStyleAfterCreated(editText);
    editText.setSingleLine();
    editText.setMovementMethod(null);
}