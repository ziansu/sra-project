@java.lang.Override
protected android.view.View getTitleView(java.lang.String title, int index, android.view.View convertView, android.view.ViewGroup parent) {
    android.widget.TextView titleView;
    titleView = ((android.widget.TextView) (mainActivity.getLayoutInflater().inflate(R.layout.invoice_list_group_item, null)));
    titleView.setText(title);
    return titleView;
}