private java.lang.String displayName(java.lang.String nam) {
    android.widget.EditText txtname = ((android.widget.EditText) (findViewById(R.id.editxt_name)));
    nam = txtname.getText().toString();
    return nam;
}