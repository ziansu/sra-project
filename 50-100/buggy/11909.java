public static java.lang.CharSequence applyToText(java.lang.CharSequence charSequence, android.graphics.Typeface typeface, int start, int end) {
    android.text.Spannable spannable;
    if (charSequence instanceof android.text.Spannable) {
        spannable = ((android.text.Spannable) (charSequence));
    }else {
        spannable = android.text.SpannableString.valueOf(charSequence);
    }
    spannable.setSpan(cat.ppicas.customtypeface.CustomTypefaceSpan.getInstance(typeface), start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
    return spannable;
}