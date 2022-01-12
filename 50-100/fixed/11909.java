public static void applyToText(java.lang.CharSequence charSequence, android.graphics.Typeface typeface, int start, int end) {
    if (charSequence instanceof android.text.Spannable) {
        android.text.Spannable spannable = ((android.text.Spannable) (charSequence));
        spannable.setSpan(cat.ppicas.customtypeface.CustomTypefaceSpan.getInstance(typeface), start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
    }
}