public void addVariable(java.lang.String ident) throws java.lang.Exception {
    this.symbolTable.addVariable(ident, false);
    this.ssa_stack.get(0).put(ident, new edu.uci.cs241.ir.PhiFunction(ident, 0, 0));
}