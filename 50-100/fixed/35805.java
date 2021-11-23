private boolean extractVerses(java.lang.String chapter, java.lang.CharSequence text, java.lang.String start, java.lang.String end) {
    boolean success = true;
    if (null == start) {
        java.lang.String verse0 = "0";
        start = verse0;
    }
    int startVerse = java.lang.Integer.valueOf(start);
    int endVerse = java.lang.Integer.valueOf(end);
    success = extractVerseRange(chapter, text, startVerse, endVerse, start);
    return success;
}