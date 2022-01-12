private java.lang.CharSequence columnsInLine(char[] chars, int startPos, int lastPos) {
    if ((chars[lastPos]) == (com.selonj.katas.WordWrap.WHITE_SPACE)) {
        return substring(chars, startPos, lastPos);
    }
    int lastSpacePos = lastSpacePosInLine(chars, startPos, lastPos);
    if (lastSpacePos != (com.selonj.katas.WordWrap.EOF)) {
        return substring(chars, startPos, lastSpacePos);
    }else {
        return substring(chars, startPos, (lastPos + 1));
    }
}