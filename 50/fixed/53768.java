public static yaplstack.ast.AST defun(java.lang.String name, java.lang.String[] params, yaplstack.ast.AST code) {
    return yaplstack.ast.AST.Factory.local(name, yaplstack.ast.AST.Factory.fn(params, code));
}