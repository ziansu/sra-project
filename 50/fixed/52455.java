@org.jetbrains.annotations.NotNull
public static java.lang.String fixUrl(@org.jetbrains.annotations.NotNull
java.lang.String original) {
    return (original.isEmpty()) || (original.endsWith("/")) ? original : original + '/';
}