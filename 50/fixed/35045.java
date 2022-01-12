@java.lang.Override
public microtrafficsim.utils.strings.builder.LevelStringBuilder appendlnCodePoint(int codePoint) {
    append(codePoint);
    stringBuilder.append("\n");
    return this;
}