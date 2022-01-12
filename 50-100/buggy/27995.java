protected void createGroup(java.lang.String title) {
    android.widget.LinearLayout layout = ((android.widget.LinearLayout) (android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.empty_component_group, null)));
    parent.addView(layout);
    parent = layout;
    android.widget.TextView titleView = new android.widget.TextView(parent.getContext());
    titleView.setTextAppearance(parent.getContext(), android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Large);
    parent.addView(titleView);
    titleView.setText(title);
}