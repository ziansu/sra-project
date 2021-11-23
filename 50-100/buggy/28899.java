private static java.lang.String escapeString(java.lang.String input) {
    java.lang.String output = "";
    output += input.replace("\"", "\\\"").replace("\\", "\\\\").replace("/", "\\/").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    return output;
}