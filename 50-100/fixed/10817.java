private java.lang.String[] arrayListToArray(java.util.ArrayList<java.lang.String> needingConversion) {
    int count = needingConversion.size();
    java.lang.String[] converted = new java.lang.String[count];
    for (int i = 0; i < count; i++) {
        converted[i] = needingConversion.get(i);
    }
    return converted;
}