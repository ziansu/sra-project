@java.lang.Override
public java.lang.Object visitErrorousStat(kalang.antlr.KalangParser.ErrorousStatContext esc) {
    super.visitErrorousStat(esc);
    java.lang.Object ast = visit(esc.expression());
    if (ast instanceof kalang.ast.AstNode) {
        return new kalang.ast.ExprStmt(new kalang.ast.ErrorousExpr(((kalang.ast.AstNode) (ast))));
    }else
        return null;
    
}