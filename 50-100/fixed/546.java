private java.util.ArrayList<java.lang.String> setArraysWithEmptyStringElementsToNull(java.util.ArrayList<java.lang.String> list) {
    if (list != null) {
        for (java.lang.String element : list) {
            java.lang.String whiteSpaceStripped = element.replaceAll("\\s+", "");
            if ((whiteSpaceStripped.length()) > 0) {
                return list;
            }
        }
        return null;
    }
    return null;
}