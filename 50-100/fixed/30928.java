protected java.lang.String convertFieldName(java.lang.String name) {
    java.lang.StringBuffer result = new java.lang.StringBuffer();
    for (char c : name.toCharArray()) {
        if (java.lang.Character.isUpperCase(c)) {
            result.append("_");
        }
        result.append(java.lang.Character.toLowerCase(c));
    }
    return result.toString();
}