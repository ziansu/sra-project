@butterknife.OnClick(value = R.id.baseDialog)
public void baseDialog(android.view.View v) {
    com.bryan.lib.dialog.FastDialog.ShowNormalDialog(context, "提示", "是否确定退出程序?", null, new com.flyco.dialog.listener.OnBtnRightClickL() {
        @java.lang.Override
        public void onBtnRightClick() {
            com.bryan.lib.util.T.showShort(context, "确定");
        }
    });
}