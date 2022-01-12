public static android.text.SpannableStringBuilder createTextWithSpan(java.lang.String text, java.lang.String spanText, android.text.style.StyleSpan style) {
    android.text.SpannableStringBuilder sb = new android.text.SpannableStringBuilder(text);
    int start = text.lastIndexOf(spanText);
    int end = start + (spanText.length());
    sb.setSpan(style, start, end, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
    return sb;
}