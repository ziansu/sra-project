@java.lang.Override
public java.lang.Void visitFunctionStmt(de.fhg.iais.roberta.syntax.stmt.FunctionStmt<java.lang.Void> functionStmt) {
    functionStmt.getFunction().visit(this);
    return null;
}