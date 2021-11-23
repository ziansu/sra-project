@java.lang.Override
public com.runbox.debug.script.expression.token.Token token() throws java.lang.Exception {
    if (null != (express)) {
        if (null == (peek)) {
            skip();
            com.runbox.debug.script.expression.token.Token token = (operator(lookup())) ? operator() : operand();
            front = correct(token);
            return front;
        }else {
            com.runbox.debug.script.expression.token.Token token = peek;
            peek = null;
            return token;
        }
    }
    throw new java.lang.Exception("invalid token");
}