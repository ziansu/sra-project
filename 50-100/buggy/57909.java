public static almorsey.teaseme.Page stringToPage(java.lang.String pageString) {
    int index = pageString.indexOf('=');
    java.lang.String id = pageString.substring(0, index);
    pageString = pageString.substring((index + 2), ((pageString.length()) - 1));
    java.util.ArrayList<java.lang.String> sets = new java.util.ArrayList<>();
    sets.addAll(java.util.Arrays.asList(pageString.split(",")));
    return new almorsey.teaseme.Page(id, sets);
}