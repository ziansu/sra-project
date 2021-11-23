public void onClickShowHideFilters(android.view.View view) {
    android.widget.LinearLayout button_filter = ((android.widget.LinearLayout) (findViewById(R.id.filters_container)));
    if ((button_filter.getVisibility()) == (android.view.View.GONE))
        button_filter.setVisibility(View.VISIBLE);
    else {
        button_filter.setVisibility(View.GONE);
        android.widget.EditText editText_brand = ((android.widget.EditText) (findViewById(R.id.editText_client_code)));
        editText_brand.clearFocus();
        android.widget.EditText editText_client_code = ((android.widget.EditText) (findViewById(R.id.editText_client_code)));
        editText_client_code.clearFocus();
    }
}