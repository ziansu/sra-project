public static java.lang.String snipTextNearKeyword(java.lang.String textToSnip, java.lang.String keyword) {
    int startIndex = amai.org.conventions.utils.Strings.findIndexOfXWordBefore(textToSnip, keyword, 3);
    if (startIndex <= 0) {
        return textToSnip.substring(0, java.lang.Math.min(textToSnip.length(), amai.org.conventions.utils.Strings.MAX_SNIPPIT_SIZE));
    }else {
        return "..." + (textToSnip.substring(startIndex, java.lang.Math.min(textToSnip.length(), (startIndex + (amai.org.conventions.utils.Strings.MAX_SNIPPIT_SIZE)))));
    }
}