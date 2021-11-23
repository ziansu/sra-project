public static java.lang.String[] normalize(java.lang.String[] strings) {
    java.lang.String[] out = new java.lang.String[strings.length];
    for (int i = 0; i < (strings.length); i++) {
        strings[i] = com.univocity.parsers.common.ArgumentUtils.normalize(strings[i]);
    }
    return out;
}