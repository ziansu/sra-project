private void visitForInvalids(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    if (isLeaf(step)) {
        if (step.isInvalid()) {
            (counter)++;
        }
    }
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        visitForInvalids(child);
    }
}