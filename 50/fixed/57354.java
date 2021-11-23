@java.lang.Override
protected double differentiateRespectingBranchSubstitutions(final beast.evolution.tree.NodeRef node) {
    if (treeModel.isRoot(node))
        return 0.0;
    
    return calculateDifferentiatedLogLikelihood(node);
}