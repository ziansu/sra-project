public static java.lang.String convertToGroupString(java.lang.String[] group) {
    java.lang.String str = "";
    for (int i = 0; i < ((group.length) - 1); i++) {
        str.concat(group[i]);
        str.concat(":");
    }
    str.concat(group[((group.length) - 1)]);
    return str;
}