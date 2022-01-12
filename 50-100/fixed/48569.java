private jlang.clex.SourceLocation getSourceLocation(int curPos, int toklen) {
    assert (curPos >= 0) && (curPos <= (bufferEnd)) : "Location out of range for this buffer!";
    int charNo = curPos;
    if (fileLoc.isFileID())
        return fileLoc.getFileLocWithOffset(charNo);
    
    assert (pp) != null : "This doesn't work on raw lexers";
    return jlang.clex.Lexer.getMappedTokenLoc(pp, fileLoc, charNo, toklen);
}