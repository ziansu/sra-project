public com.marasm.ppc.Variable Get(java.lang.String varname) {
    com.marasm.ppc.Variable v = vars.get(varname);
    if (v != null) {
        return new com.marasm.ppc.Variable(v);
    }
    v = gvars.get(varname);
    if (v != null) {
        return new com.marasm.ppc.Variable(v);
    }
    com.marasm.ppc.Log.error((("Variable'" + varname) + "' does not exist!"));
    return null;
}