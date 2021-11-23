@java.lang.Override
public microtrafficsim.utils.strings.builder.LevelStringBuilder appendln(char[] str, int offset, int len) {
    append(str, offset, len);
    stringBuilder.append("\n");
    return this;
}