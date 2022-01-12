static java.lang.String[] getDataForSeparator(char placeholder, char sep, java.lang.String[] data) {
    java.lang.String[] result = new java.lang.String[data.length];
    for (int i = 0; i < (data.length); i++) {
        result[i] = data[i].replace(placeholder, sep);
    }
    return result;
}