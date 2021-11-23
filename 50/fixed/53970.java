@org.jetbrains.annotations.NotNull
public static java.lang.String changeNewLineFromUnixToWindows(@org.jetbrains.annotations.NotNull
final java.lang.String string) {
    return string.replace("\n", "\r\n");
}