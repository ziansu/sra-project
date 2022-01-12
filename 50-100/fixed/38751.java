@org.jetbrains.annotations.NotNull
public static java.lang.String mapToGetString(@org.jetbrains.annotations.NotNull
java.lang.String name, @org.jetbrains.annotations.NotNull
java.lang.String[] values) {
    java.lang.String encodedName = org.stepik.api.Utils.encode(name);
    return java.util.Arrays.stream(values).map(( value) -> (encodedName + "=") + (org.stepik.api.Utils.encode(value))).collect(java.util.stream.Collectors.joining("&"));
}