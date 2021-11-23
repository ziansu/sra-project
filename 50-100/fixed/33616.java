private java.lang.String display(java.lang.String result) {
    java.lang.StringBuffer strBuf = new java.lang.StringBuffer();
    for (int i = 0; i < (result.length()); i++) {
        int c = java.lang.Character.getNumericValue(result.charAt(i));
        strBuf.append(reverse.get(c));
    }
    return strBuf.toString();
}