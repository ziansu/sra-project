private void updateLabel(org.wordpress.android.widgets.WPTextView textView, java.lang.String text) {
    textView.setText(text);
    if ((text == null) || (text.isEmpty())) {
        textView.setVisibility(View.GONE);
    }else {
        textView.setVisibility(View.VISIBLE);
    }
}