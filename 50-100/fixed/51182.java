public int getColumnNumber(jlang.basic.FileID fid, int filePos) {
    char[] buf = getBuffer(fid).getBuffer();
    int lineStart = filePos;
    while (((lineStart != 0) && ((buf[(lineStart - 1)]) != '\n')) && ((buf[(lineStart - 1)]) != '\r'))
        --lineStart;
    
    return (filePos - lineStart) + 1;
}