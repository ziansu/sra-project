public static java.util.ArrayList<java.lang.String> getListItems(java.lang.String responseString) {
    java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
    java.util.regex.Matcher matcher = Framework.Networking.Response.ResponsePatterns.listItemsPattern.matcher(responseString);
    if ((matcher.groupCount()) > 0) {
        while (matcher.find()) {
            list.add(matcher.group(1));
        } 
    }
    return list;
}