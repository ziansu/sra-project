private void Notice() {
    me.drakeet.materialdialog.MaterialDialog builder = new me.drakeet.materialdialog.MaterialDialog(this);
    builder.setTitle("提示");
    builder.setMessage("\u81eaAndroid6.0\uff0c\u7531\u4e8e\u65b0\u589e\u6743\u9650\u7ba1\u7406API\n\n\u82e5\u8981\u6b63\u5e38\u4f7f\u7528ZRecovery\uff0c\u8bf7\u63a5\u53d7\u4ee5\u4e0b\u6743\u9650\u7533\u8bf7");
    builder.setPositiveButton("明白", new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            PmRequest(PER_ALL, 666);
        }
    });
    builder.setNegativeButton("取消", new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            finish();
        }
    });
    builder.show();
}