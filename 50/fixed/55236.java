@org.jetbrains.annotations.NotNull
public static java.lang.String getSimpleName(@org.jetbrains.annotations.NotNull
java.lang.String canonicalClassName) {
    return canonicalClassName.substring(((canonicalClassName.lastIndexOf(".")) + 1));
}