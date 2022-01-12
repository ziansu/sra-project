public static int numOccurrences(java.lang.String src, java.lang.String query) {
    int searchIndex = 0;
    int foundIndex;
    searchIndex = src.indexOf(query, 0);
    int occurrences = (searchIndex == (-1)) ? 1 : 0;
    while (searchIndex != (-1)) {
        foundIndex = src.indexOf(query, (searchIndex + 1));
        searchIndex = foundIndex;
        occurrences++;
    } 
    return occurrences;
}