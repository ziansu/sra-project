public java.lang.String toJson(boolean prettyPrint) throws java.io.IOException {
    java.io.StringWriter writer = new java.io.StringWriter();
    toJson(writer, prettyPrint, true);
    return writer.toString();
}