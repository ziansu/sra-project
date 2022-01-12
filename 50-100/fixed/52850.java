public int extractNodeIndex(java.lang.String line) throws java.lang.NumberFormatException {
    java.lang.String attributeName = "index=";
    java.lang.String restOfLine = line.substring(((line.indexOf(attributeName)) + (attributeName.length())));
    int indexOfNextSpace = restOfLine.indexOf(" ");
    return java.lang.Integer.parseInt(restOfLine.substring(0, indexOfNextSpace));
}