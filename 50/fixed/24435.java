public long extractNodeIDFromNodeLine(java.lang.String line) throws java.lang.NumberFormatException {
    java.lang.String attributeName = "id";
    return java.lang.Long.parseLong(extractUniqueAttribute(line, attributeName));
}