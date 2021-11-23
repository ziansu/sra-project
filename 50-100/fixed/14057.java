public static java.lang.String validateCreatureTypes(java.lang.String[] types) {
    for (int i = 0; i < (types.length); i++) {
        types[i] = types[i].replace("-", "");
    }
    return java.lang.String.join("-", types);
}