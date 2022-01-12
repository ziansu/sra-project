private java.lang.CharSequence columnsInLine(char[] chars, int startPos, int lastPos) {
    if ((chars[lastPos]) == (com.selonj.katas.WordWrap.WHITE_SPACE)) {
        return substring(chars, startPos, lastPos);
    }
    return substring(chars, startPos, (lastPos + 1));
}