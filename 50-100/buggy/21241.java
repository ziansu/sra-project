@java.lang.Override
char nextChar(boolean isEOFAllowed) {
    char ch;
    if ((pushBack) != (com.dell.doradus.common.JSONAnnie.EOF)) {
        ch = pushBack;
        pushBack = com.dell.doradus.common.JSONAnnie.EOF;
    }else {
        try {
            ch = ((char) (reader.read()));
        } catch (java.io.IOException e) {
            ch = com.dell.doradus.common.JSONAnnie.EOF;
        }
    }
    com.dell.doradus.common.JSONAnnie.check(((ch != (com.dell.doradus.common.JSONAnnie.EOF)) || isEOFAllowed), "Unexpected EOF");
    return ch;
}