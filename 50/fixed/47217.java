@java.lang.Override
void apply(android.text.SpannableStringBuilder sb, int sequencePos, android.content.Context context, java.util.regex.Matcher textMatcher) {
    addEmptyLine(sb, 0.5F);
    java.lang.String text = textMatcher.group(1);
    if (text != null) {
        sb.append(text);
    }
}