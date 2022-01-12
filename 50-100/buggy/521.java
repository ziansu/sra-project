public static java.lang.String execute(java.util.List<com.jantuomi.tunkki.core.parser.ast.ASTNode> sequence) throws com.jantuomi.tunkki.exception.TunkkiError {
    java.lang.String output = "";
    com.jantuomi.tunkki.core.parser.datatype.Datatype data;
    for (com.jantuomi.tunkki.core.parser.ast.ASTNode node : sequence) {
        try {
            data = node.evaluate();
        } catch (java.lang.NullPointerException ex) {
            throw new com.jantuomi.tunkki.exception.TunkkiError(TunkkiError.ExceptionType.GeneralError, (-1), "Malformed input.");
        }
        if (data != null) {
            output = data.toString();
        }else {
            break;
        }
    }
    return output;
}