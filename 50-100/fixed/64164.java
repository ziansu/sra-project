private java.lang.String trimInputLineWithoutRemoveHashTags(java.lang.String inputLine, java.util.ArrayList<java.lang.String> removeTagLists) {
    for (int i = 0; i < (removeTagLists.size()); i++) {
        inputLine = inputLine.replace(("-#" + (removeTagLists.get(i))), "").trim();
    }
    return inputLine;
}