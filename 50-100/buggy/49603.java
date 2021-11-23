@butterknife.OnClick(value = R.id.listDialog)
public void listDialog(android.view.View v) {
    final java.lang.String[] stringItems = new java.lang.String[]{ "收藏" , "下载" , "分享" , "删除" , "歌手" , "专辑" };
    com.bryan.lib.dialog.FastDialog.ShowListDialog(context, stringItems, true, new com.flyco.dialog.listener.OnOperItemClickL() {
        @java.lang.Override
        public void onOperItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            com.bryan.lib.util.T.showShort(context, stringItems[position]);
        }
    });
}