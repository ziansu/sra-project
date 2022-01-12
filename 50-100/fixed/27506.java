public static java.lang.String encrypt(java.lang.String s) {
    char[] encryptString = s.toCharArray();
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (char c : encryptString) {
        sb.append(SimpleCryp.encryptMap.get(c));
    }
    return sb.toString();
}