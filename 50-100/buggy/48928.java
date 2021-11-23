@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View view = convertView;
    if (view == null) {
        view = lInflater.inflate(R.layout.item, parent, false);
    }
    com.example.work.colors.Item i = getProduct(position);
    ((android.widget.TextView) (view.findViewById(R.id.tv_color))).setText(i.color_name);
    ((android.widget.TextView) (view.findViewById(R.id.tv_color))).setTextColor(android.graphics.Color.parseColor(i.color_code));
    return view;
}