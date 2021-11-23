private void visitForAllLeaves(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    if (isLeaf(step)) {
        (counter)++;
    }
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        visitForAllLeaves(child);
    }
}