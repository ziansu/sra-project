public int getColumnNumber(jlang.basic.FileID fid, int filePos) {
    char[] buf = getBuffer(fid).getBuffer();
    int lineStart = filePos;
    while (((lineStart != 0) && ((buf[lineStart]) != '\n')) && ((buf[lineStart]) != '\r'))
        --lineStart;
    
    return (filePos - lineStart) + 1;
}