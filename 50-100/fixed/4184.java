private boolean isSpoilerUnBlurred(long commentID, int startIndex, int endIndex) {
    int key = unBlurredContents.indexOfKey(commentID);
    if (key >= 0) {
        java.util.List<android.support.v4.util.Pair<java.lang.Integer, java.lang.Integer>> blurIndexes = unBlurredContents.get(commentID);
        for (android.support.v4.util.Pair<java.lang.Integer, java.lang.Integer> blurIndex : blurIndexes) {
            if (((blurIndex.first) == startIndex) && ((blurIndex.second) == endIndex)) {
                return true;
            }
        }
    }
    return false;
}