@java.lang.Override
public android.view.View getGroupView(int groupPosition, boolean isExpanded, android.view.View convertView, android.view.ViewGroup parent) {
    convertView = null;
    if (convertView == null) {
        convertView = inflater.inflate(R.layout.fragment_date, parent, false);
        android.widget.TextView activity_date = ((android.widget.TextView) (convertView.findViewById(R.id.logEntryDate)));
        activity_date.setText(getGroup(groupPosition).toString());
    }
    return convertView;
}