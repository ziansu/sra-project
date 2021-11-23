private <T> int caluculateToIndex(java.util.List<T> list, int startIndex) {
    int toIndex = 0;
    if ((list.size()) < (startIndex + (searchResultSize))) {
        toIndex = list.size();
    }else {
        toIndex = startIndex + (searchResultSize);
    }
    return toIndex;
}