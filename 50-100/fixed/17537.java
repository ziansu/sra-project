@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    android.view.View rowView = inflater.inflate(R.layout.list_item_layout, parent, false);
    android.widget.TextView textView = ((android.widget.TextView) (rowView.findViewById(R.id.list_item_text)));
    textView.setText(values.get(position));
    return rowView;
}