public android.view.View getGroupView(int groupPosition, boolean isExpanded, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        convertView = android.view.View.inflate(mParent, android.R.layout.simple_list_item_1, null);
        convertView.setPadding(70, 0, 0, 0);
    }
    android.widget.TextView textView = ((android.widget.TextView) (convertView.findViewById(android.R.id.text1)));
    textView.setText(getGroup(groupPosition).label.toString());
}