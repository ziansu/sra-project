@java.lang.Override
public com.hauldata.util.tokenizer.Token nextToken() throws java.io.IOException, java.util.InputMismatchException {
    com.hauldata.util.tokenizer.Token token;
    if (position.hasNext()) {
        token = position.next();
    }else {
        token = super.getToken();
        if (token != null) {
            position.add(token);
        }
    }
    return token;
}