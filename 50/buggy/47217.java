@java.lang.Override
void apply(android.text.SpannableStringBuilder sb, int sequencePos, android.content.Context context, java.util.regex.Matcher textMatcher) {
    addEmptyLine(sb, 0.5F);
    sb.append(textMatcher.group(1));
}