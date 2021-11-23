@java.lang.Override
char nextChar(boolean isEOFAllowed) {
    int ch;
    if ((pushBack) != (-1)) {
        ch = pushBack;
        pushBack = -1;
    }else {
        try {
            ch = reader.read();
        } catch (java.io.IOException e) {
            ch = -1;
        }
    }
    com.dell.doradus.common.JSONAnnie.check(((ch != (-1)) || isEOFAllowed), "Unexpected EOF");
    return ((char) (ch));
}