@org.jetbrains.annotations.NotNull
public static java.lang.String changeNewLineFromWindowsToUnix(@org.jetbrains.annotations.NotNull
final java.lang.String string) {
    return string.replaceAll("\r\n", "\n");
}