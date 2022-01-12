@java.lang.Override
void apply(android.text.SpannableStringBuilder sb, int sequencePos, final android.content.Context context, java.util.regex.Matcher textMatcher) {
    if (sequencePos == 0) {
        addEmptyLine(sb, 0.5F);
    }
    java.lang.String text = textMatcher.group(2);
    sb.append(text);
    sb.setSpan(new se.devscout.android.view.TextViewUtil.CustomBulletSpan(context), ((sb.length()) - (text.length())), sb.length(), 0);
}