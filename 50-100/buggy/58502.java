@java.lang.Override
protected void initView() {
    super.initView();
    mCancelBtn = ((com.gc.materialdesign.views.Button) (findViewById(R.id.cancel)));
    mCancelBtn.setOnClickListener(this);
    mHasOrderTV = ((android.widget.TextView) (findViewById(R.id.has_order)));
    mCancelView = findViewById(R.id.cancel_view);
    ((android.widget.TextView) (findViewById(R.id.title))).setText(mRes.getString(R.string.check_order));
    showLoadingPage(true);
    showDisableBtnPage(false, "");
    startGetOrderInfo();
}