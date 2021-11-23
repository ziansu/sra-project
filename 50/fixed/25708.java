@java.lang.Override
public microtrafficsim.utils.strings.builder.LevelStringBuilder appendln(java.lang.CharSequence s, int start, int end) {
    append(s, start, end);
    stringBuilder.append("\n");
    return this;
}