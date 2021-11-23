private void setTextString(android.widget.TextView textView, java.lang.String textString) {
    if (!(android.text.TextUtils.isEmpty(textString))) {
        textView.setText(textString);
        textView.setVisibility(com.allen.library.VISIBLE);
    }
}