@java.lang.Override
public int execute() {
    Token x = stack.pop();
    if ((x.type) == (Token.Type.NUMBER)) {
        int a = java.lang.Integer.tryParse(x.value);
        Token z = new Token(Token.Type.NUMBER, java.lang.String.valueOf((-a)));
        stack.push(z);
    }else {
        java.lang.System.out.println("Type error!");
        java.lang.System.exit(1);
    }
    return 0;
}