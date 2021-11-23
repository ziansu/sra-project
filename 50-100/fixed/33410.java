public java.lang.String brewJava() throws java.lang.Exception {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append("savingData.put(\"").append(fieldName).append("\", target.").append(fieldName).append(");\n");
    return builder.toString();
}