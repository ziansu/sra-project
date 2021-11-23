private android.widget.CheckBox addSupport(android.view.View convertView, boolean action, int id) {
    android.widget.CheckBox check = ((android.widget.CheckBox) (convertView.findViewById(id)));
    check.setVisibility(View.VISIBLE);
    if (action) {
        check.setOnCheckedChangeListener(this);
    }
    return check;
}