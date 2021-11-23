@java.lang.Override
public void convert(com.remote.controller.adapter.ViewHolder helper, com.remote.controller.bean.FileLineItem item, int position, android.view.View convertView) {
    helper.setText(R.id.no, java.lang.String.valueOf((position + 1)));
    helper.setText(R.id.command, item.getCommand());
    helper.setText(R.id.parameter, item.getParameter());
    helper.setText(R.id.memo, item.getMemo());
}