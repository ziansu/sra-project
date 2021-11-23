public void parseRiver(java.lang.String group) {
    java.util.regex.Matcher matcher = findMatch(group, "[( ]-?[0-9][ ]-?[0-9][ ]-?[0-9][ )]");
    java.lang.String intString = null;
    while (matcher.find()) {
        intString = matcher.group();
    } 
    java.lang.String[] locationString = intString.split(" ");
    int x = java.lang.Integer.parseInt(locationString[1]);
    int y = java.lang.Integer.parseInt(locationString[2]);
    int z = java.lang.Integer.parseInt(locationString[3]);
}