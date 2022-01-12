@java.lang.Override
public void generate() {
    if (!(var.isLocal)) {
        ashc.codegen.GenNode.GenNode.addGenNodeField(new ashc.codegen.GenNode.GenNodeField(var));
    }else {
        java.lang.String type = var.type.toBytecodeName();
        ashc.codegen.GenNode.GenNode.addFuncStmt(new ashc.grammar.GenNodeVar(var.id, type, var.localID));
        expr.generate();
        addFuncStmt(new ashc.codegen.GenNode.GenNodeVarStore(var.type.getInstructionType(), var.localID));
    }
    super.generate();
}