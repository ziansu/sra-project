public lexical.Token nextToken() {
    try {
        return nextToken2();
    } catch (java.lang.StringIndexOutOfBoundsException e) {
        if ((categ) == (lexical.tkCateg.tk_start)) {
            return new lexical.Token("", lexical.tkCateg.tk_EOF, (-1));
        }else {
            return new lexical.Token(code.substring(initToken, code.length()), categ, initToken);
        }
    }
}