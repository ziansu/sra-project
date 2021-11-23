@java.lang.Override
protected double differentiateRespectingBranchSubstitutions(final beast.evolution.tree.NodeRef node) {
    double deriv = 0.0;
    if (!(treeModel.isRoot(node))) {
        deriv = calculateDifferentiatedLogLikelihood(node);
    }
    return deriv;
}