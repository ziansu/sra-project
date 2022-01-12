@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    convertView = android.view.LayoutInflater.from(getContext()).inflate(resourceId, null);
    android.widget.TextView warehouseName = ((android.widget.TextView) (convertView.findViewById(android.R.id.text1)));
    warehouseName.setText(list.get(position).toString());
    return convertView;
}