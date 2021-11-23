private void setTextString(android.widget.TextView textView, java.lang.String textString) {
    textView.setText(textString);
    if (!(android.text.TextUtils.isEmpty(textString))) {
        textView.setVisibility(com.allen.library.VISIBLE);
    }
}