@java.lang.Override
public void generate() {
    if (!(var.isLocal)) {
        ashc.codegen.GenNode.GenNode.addGenNodeField(new ashc.codegen.GenNode.GenNodeField(var));
    }else {
        ashc.codegen.GenNode.GenNode.addFuncStmt(new ashc.grammar.GenNodeVar(var.id, var.type.toBytecodeName(), var.localID));
        expr.generate();
        addFuncStmt(new ashc.codegen.GenNode.GenNodeVarStore(var.type.getInstructionType(), var.localID));
    }
    super.generate();
}