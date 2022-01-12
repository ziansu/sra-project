@org.jetbrains.annotations.NotNull
public static java.lang.String mapToGetString(@org.jetbrains.annotations.NotNull
java.lang.String name, @org.jetbrains.annotations.NotNull
java.lang.String[] values, @org.jetbrains.annotations.NotNull
java.lang.String enc) {
    java.lang.String encodedName = org.stepik.api.Utils.encode(name, enc);
    return java.util.Arrays.stream(values).map(( value) -> (encodedName + "=") + (org.stepik.api.Utils.encode(value, enc))).collect(java.util.stream.Collectors.joining("&"));
}