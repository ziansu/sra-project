public void setPlaceholderText(java.lang.String placeholderText) {
    android.text.Spanned hint;
    java.lang.String parkedTextColor = reformatColor(mParkedTextColor);
    java.lang.String parkedHintColor = reformatColor(mParkedHintColor);
    if (mIsBoldParkedText) {
        hint = android.text.Html.fromHtml(java.lang.String.format("<font color=\"#%s\">%s</font><font color=\"#%s\"><b>%s</b></font>", parkedHintColor, placeholderText, parkedTextColor, mParkedText));
    }else {
        hint = android.text.Html.fromHtml(java.lang.String.format("<font color=\"#%s\">%s</font><font color=\"#%s\">%s</font>", parkedHintColor, placeholderText, parkedTextColor, mParkedText));
    }
    super.setHint(hint);
}