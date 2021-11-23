protected boolean pop(java.lang.String token, java.util.Stack<java.lang.String> stack, rmx.ppp.Parser.Builder builder) {
    if ((stack.isEmpty()) || (!(pair.get(token).equals(stack.peek())))) {
        builder.error(token, rmx.ppp.P.s("ui.message.error.close_symbol_unmatching"));
        return true;
    }
    stack.pop();
    builder.close(token);
    return false;
}