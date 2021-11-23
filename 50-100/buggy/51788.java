@java.lang.Override
protected android.view.View getTitleView(java.lang.String title, int index, android.view.View convertView, android.view.ViewGroup parent) {
    android.widget.TextView titleView;
    if (convertView == null) {
        titleView = ((android.widget.TextView) (mainActivity.getLayoutInflater().inflate(R.layout.invoice_list_group_item, null)));
    }else {
        titleView = ((android.widget.TextView) (convertView));
    }
    titleView.setText(title);
    return titleView;
}