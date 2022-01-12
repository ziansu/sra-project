@java.lang.Override
public microtrafficsim.utils.strings.builder.LevelStringBuilder appendln(char[] str) {
    append(str);
    stringBuilder.append("\n");
    return this;
}