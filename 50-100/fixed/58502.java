@java.lang.Override
protected void initView() {
    super.initView();
    ((android.widget.TextView) (findViewById(R.id.title))).setText(mRes.getString(R.string.check_order));
    showLoadingPage(true);
    showDisableBtnPage(false, "");
    startGetOrderInfo();
}