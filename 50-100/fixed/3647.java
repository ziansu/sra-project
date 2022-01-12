private static java.lang.StringBuilder getUnderscoredString(java.lang.StringBuilder builder, java.lang.String simpleName) {
    for (java.lang.String part : org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(simpleName)) {
        if ((builder.length()) > 0)
            builder.append("_");
        
        builder.append(part.toLowerCase());
    }
    return builder;
}