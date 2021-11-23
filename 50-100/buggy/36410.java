public static java.lang.String toCitation(java.lang.String contributor, java.lang.String description, java.lang.String publicationYear) {
    java.lang.String[] array = new java.lang.String[]{ contributor , publicationYear , description };
    java.util.List<java.lang.String> nonBlanks = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String string : array) {
        if (org.apache.commons.lang3.StringUtils.isNotBlank(string)) {
            nonBlanks.add(string);
        }
    }
    return org.apache.commons.lang3.StringUtils.join(nonBlanks, ". ");
}