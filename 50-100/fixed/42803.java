public void generateCode(bytecode.CodeFile codefile) {
    codefile.addProcedure(name);
    bytecode.CodeProcedure codeprocedure = new bytecode.CodeProcedure(name, VoidType.TYPE, codefile);
    for (syntaxtree.decl.ParamDecl paramdecl : params) {
        paramdecl.generateCode(codeprocedure);
    }
    for (syntaxtree.Decl decl : decls) {
        decl.generateCode(codeprocedure);
    }
    for (syntaxtree.Stmt stmt : stmts) {
    }
    codefile.updateProcedure(codeprocedure);
}