public java.lang.String commonLettersCaseInsensitive(java.lang.String aFirstString, java.lang.String aSecondString) {
    if ((aFirstString != null) && (aSecondString != null)) {
        return commonLetters(aFirstString.toLowerCase(), aSecondString.toLowerCase());
    }else {
        return null;
    }
}