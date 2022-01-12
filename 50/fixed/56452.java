@java.lang.Override
public void convert(com.example.yuzelli.yiai.uitls.ViewHolder helper, com.example.yuzelli.yiai.bean.TimeBean item, int position) {
    java.lang.String c = item.getT_content();
    helper.setText(R.id.tv_content, c);
}