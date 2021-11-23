private void setSubtitle(java.lang.String s) {
    if (!(android.text.TextUtils.isEmpty(s))) {
        android.widget.TextView subtitle = findView(R.id.view_toolbar_header_subtitle);
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText((("\"" + s) + "\""));
    }
}