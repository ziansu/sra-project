public void initializeReference(java.lang.Object conc_ref, org.evosuite.symbolic.expr.ref.ReferenceExpression symb_ref) {
    if (conc_ref != null) {
        if (!(symb_ref.isInitialized())) {
            symb_ref.initializeReference(conc_ref);
            int identityHashCode = java.lang.System.identityHashCode(conc_ref);
            nonNullRefs.put(identityHashCode, symb_ref);
        }
    }
}