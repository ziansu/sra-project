public static ast.ASTNodeType typeFromIdentifier(java.lang.String id) {
    for (ast.ASTNodeType type : ast.ASTNodeType.values()) {
        if (type.identifier.equals(id)) {
            return type;
        }
    }
    return ast.ASTNodeType.Unknown;
}