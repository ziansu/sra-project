@butterknife.OnClick(value = R.id.tipDialog)
public void tipDialog(android.view.View v) {
    com.bryan.lib.dialog.FastDialog.ShowTipDialog(context, "提示", "你今天的抢购名额已用完~", true, new com.flyco.dialog.listener.OnBtnClickL() {
        @java.lang.Override
        public void onBtnClick() {
            com.bryan.lib.util.T.showShort(context, "确定");
        }
    });
}