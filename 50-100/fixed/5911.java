private static boolean isEprPredicate(de.uni_freiburg.informatik.ultimate.logic.FunctionSymbol function) {
    if (function.getName().equals("not"))
        return false;
    
    if (function.getName().equals("or"))
        return false;
    
    if (function.getName().equals("ite"))
        return false;
    
    return true;
}