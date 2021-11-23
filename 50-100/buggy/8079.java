private java.lang.String getWordEndingAtPosition(int startingPosition, int atPosition) {
    java.lang.String startingText = text.substring(startingPosition, atPosition);
    int lastIndex = startingText.lastIndexOf(" ");
    if (lastIndex == (-1)) {
        return "";
    }else {
        return startingText.substring(lastIndex, ((startingText.length()) - 1)).trim();
    }
}