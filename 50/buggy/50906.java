public static org.libsmith.anvil.time.Stopwatch.Group group(@javax.annotation.Nonnull
java.lang.String groupNameFormat, java.lang.Object... patternArguments) {
    return org.libsmith.anvil.time.Stopwatch.group(java.text.MessageFormat.format(groupNameFormat, patternArguments));
}