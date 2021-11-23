private java.lang.String formatListValue(int indentLevel, java.util.List<java.lang.Object> value) {
    indentLevel++;
    java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    for (java.lang.Object element : value) {
        if (element != null) {
            buffer.append("\n").append(indent(indentLevel)).append("- ").append(formatValue(false, indentLevel, element));
        }
    }
    return buffer.toString();
}