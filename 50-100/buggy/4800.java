public java.util.List<coverage.Obligation> generate(java.util.HashMap<jkind.lustre.VarDecl, coverage.ObservedTree> sequantialTrees) {
    java.util.List<coverage.Obligation> obligations = new java.util.ArrayList<coverage.Obligation>();
    coverage.ObservedTree tree;
    for (jkind.lustre.VarDecl root : sequantialTrees.keySet()) {
        java.lang.System.out.println((("Generate delay dependency epxressions for [" + root) + "]..."));
        tree = sequantialTrees.get(root);
        generateObligationForTree(exprsMap, tree);
        obligations.addAll(getObligations(exprsMap));
    }
    return obligations;
}