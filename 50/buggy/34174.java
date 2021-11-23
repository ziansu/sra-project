@java.lang.Override
public java.util.Set<java.lang.String> getFreeVariables() {
    java.util.Set<java.lang.String> freeVars = inExpr.getFreeVariables();
    freeVars.remove(varName);
    freeVars.addAll(toReplace.getFreeVariables());
    freeVars.remove(varName);
    return freeVars;
}