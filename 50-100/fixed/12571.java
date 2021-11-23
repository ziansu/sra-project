@butterknife.OnClick(value = R.id.actionSheetDialog)
public void actionSheetDialog(android.view.View v) {
    final java.lang.String[] stringItems = new java.lang.String[]{ "版本更新" , "帮助与反馈" , "退出QQ" };
    com.bryan.lib.dialog.FastDialog.ShowActionSheetDialog(context, stringItems, new com.flyco.dialog.listener.OnOperItemClickL() {
        @java.lang.Override
        public void onOperItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            com.bryan.lib.util.T.showShort(context, stringItems[position]);
        }
    });
}