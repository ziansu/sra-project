private void addExtraButtons() {
    android.widget.LinearLayout l = ((android.widget.LinearLayout) (getChildAt(0)));
    android.view.LayoutInflater layoutInflater = android.view.LayoutInflater.from(getContext());
    android.view.View v = layoutInflater.inflate(R.layout.search_view_buttons, l, false);
    l.addView(v);
    setOnClickListener(R.id.search_back);
    setOnClickListener(R.id.search_forward);
    setOnClickListener(R.id.search_case);
    updateCaseSensitiveButton();
}