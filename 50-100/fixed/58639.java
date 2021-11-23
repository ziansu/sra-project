@java.lang.Override
void apply(android.text.SpannableStringBuilder sb, int sequencePos, final android.content.Context context, final java.util.regex.Matcher textMatcher) {
    addEmptyLine(sb, 0.5F);
    java.lang.String text = textMatcher.group(2);
    if (text != null) {
        sb.append(text);
        sb.setSpan(new se.devscout.android.view.TextViewUtil.HeaderSpan(textMatcher, context), ((sb.length()) - (text.length())), sb.length(), 0);
    }
}