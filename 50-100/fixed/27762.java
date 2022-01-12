@java.lang.Override
void apply(android.text.SpannableStringBuilder sb, int sequencePos, android.content.Context context, java.util.regex.Matcher textMatcher) {
    if (sequencePos == 0) {
        addEmptyLine(sb, 0.5F);
    }
    java.lang.String text = textMatcher.group(1);
    if (text != null) {
        sb.append(text);
        sb.setSpan(new android.text.style.BulletSpan(((android.text.style.BulletSpan.STANDARD_GAP_WIDTH) * 5)), ((sb.length()) - (text.length())), sb.length(), 0);
    }
}