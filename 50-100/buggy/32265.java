public static boolean comparingNames(java.lang.String name, java.lang.String otherName) {
    for (java.lang.String word : noraui.utils.NameUtilities.getNormalizeName(name).split(" ")) {
        if (!(org.apache.commons.lang3.StringUtils.containsIgnoreCase(noraui.utils.NameUtilities.getNormalizeName(name).trim(), word))) {
            return false;
        }
    }
    return true;
}