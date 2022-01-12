@android.support.annotation.NonNull
private java.lang.String replaceOriginalText(int startIndex, java.lang.String originalText, int endIndex, java.lang.String sliceTextByRemovedSpace) {
    java.lang.String frontBlock = originalText.substring(0, startIndex);
    java.lang.String backBlock = originalText.substring(endIndex, originalText.length());
    return (frontBlock + sliceTextByRemovedSpace) + backBlock;
}