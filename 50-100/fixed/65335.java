public static java.lang.String generateID(int length) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < length; i++) {
        int random = ((int) ((java.lang.Math.random()) * (de.tohemi.justparty.util.IDGenerator.parts.length)));
        sb.append(de.tohemi.justparty.util.IDGenerator.parts[random]);
    }
    return sb.toString();
}