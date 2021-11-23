private android.widget.CheckBox removeSupport(android.view.View convertView, int id) {
    android.widget.CheckBox check = ((android.widget.CheckBox) (convertView.findViewById(id)));
    check.setVisibility(View.GONE);
    return check;
}