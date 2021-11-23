public void initializeReference(java.lang.Object conc_ref, org.evosuite.symbolic.expr.ref.ReferenceExpression symb_ref) {
    if (conc_ref != null) {
        org.evosuite.symbolic.expr.ref.ReferenceConstant symb_non_null_ref = ((org.evosuite.symbolic.expr.ref.ReferenceConstant) (symb_ref));
        if (!(symb_non_null_ref.isInitialized())) {
            symb_non_null_ref.initializeReference(conc_ref);
            int identityHashCode = java.lang.System.identityHashCode(conc_ref);
            nonNullRefs.put(identityHashCode, symb_non_null_ref);
        }
    }
}