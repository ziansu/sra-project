public AST.T_Seq buildProgram() {
    src.IRUtils.init();
    AST.T_Seq classes = this.buildIr();
    AST.T_Exp accessViolation = new AST.T_AccessViolation();
    AST.T_Seq main = new AST.T_Seq(new AST.T_Raw(java.lang.String.format("main:%n")), new AST.T_JumpLabel(this.programMain));
    return new AST.T_Seq(main, new AST.T_Seq(classes, accessViolation));
}