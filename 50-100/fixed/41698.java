private static java.lang.String cutSpaces(java.lang.String rhs) {
    java.lang.String result;
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    char tempChar;
    for (int i = 0; i < (rhs.length()); i++) {
        tempChar = rhs.charAt(i);
        if (tempChar != ' ') {
            sb.append(tempChar);
        }
    }
    result = new java.lang.String(sb.toString());
    return result;
}