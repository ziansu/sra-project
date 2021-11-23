public org.renjin.sexp.SEXP findVariableOrThrow(java.lang.String name) {
    org.renjin.sexp.SEXP value = findVariable(org.renjin.sexp.Symbol.get(name));
    if (value == (Symbol.UNBOUND_VALUE)) {
        throw new org.renjin.eval.EvalException((("object '" + name) + "' not found"));
    }
    return value;
}