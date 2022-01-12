public static java.lang.String printPgqlString(oracle.pgql.lang.ir.QueryVariable variable) {
    if ((variable.getVariableType()) == (oracle.pgql.lang.ir.QueryVariable.VariableType.EXP_AS_VAR)) {
        oracle.pgql.lang.ir.ExpAsVar expAsVar = ((oracle.pgql.lang.ir.ExpAsVar) (variable));
        if (expAsVar.isAnonymous()) {
            return expAsVar.getExp().toString();
        }else {
            return variable.name;
        }
    }
    return variable.isAnonymous() ? "" : variable.name;
}