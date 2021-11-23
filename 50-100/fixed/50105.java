public static java.util.HashMap<lisp.Symbol, lisp._Sexpr> getScope() {
    java.util.HashMap<lisp.Symbol, lisp._Sexpr> scope = new java.util.HashMap<lisp.Symbol, lisp._Sexpr>();
    java.util.ListIterator<context.Context> listIterator = context.Contexts.contexts.listIterator();
    while (listIterator.hasNext()) {
        scope.putAll(listIterator.next().getScopeFromContext());
    } 
    return scope;
}