public android.view.View getView(int index, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View view = convertView;
    if (view == null) {
        view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.user_view, parent, false);
    }
    java.lang.String uname = getItem(index);
    android.widget.TextView tw = ((android.widget.TextView) (view.findViewById(R.id.uname)));
    tw.setText(uname);
    view.setTag(uname);
    return view;
}