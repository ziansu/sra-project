@java.lang.Override
public java.lang.String escapeUnsafeCharacters(java.lang.String input) {
    return input.replace("*/", "*_/").replace("/*", "/_*");
}