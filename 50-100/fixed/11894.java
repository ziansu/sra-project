public static void spannableEmoticonFilterFromFile(final android.widget.TextView tv_content, java.lang.String filePath, java.lang.String content) {
    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(content);
    android.text.Spannable spannable = com.sj.androidemoji.EmojiDisplayFromFIle.spannableFilter(tv_content.getContext(), filePath, spannableStringBuilder, content, com.sj.androidemoji.MainActivity.getFontHeight(tv_content), null);
    tv_content.setText(spannable);
}