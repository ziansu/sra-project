public boolean addAllParameters(java.util.List<java.lang.String> params) throws java.lang.Exception {
    if ((this.parameter_size) == 0) {
        for (java.lang.String param : params) {
            this.symbolTable.addVariable(param, true);
            this.ssa_stack.get(0).put(param, new edu.uci.cs241.ir.PhiFunction(param, 0, 0));
            (this.parameter_size)++;
        }
        return true;
    }else {
        return false;
    }
}