private java.lang.String formatListValue(int indentLevel, java.util.List<java.lang.Object> value) {
    java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    for (java.lang.Object element : value) {
        if (element != null) {
            buffer.append("\n").append(indent(indentLevel)).append("- ").append(formatValue(false, (indentLevel + 1), element));
        }
    }
    return buffer.toString();
}