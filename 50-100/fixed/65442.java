private void visitForPotentialSolutions(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    if (isLeaf(step)) {
        if ((!(step.isDuplicate())) && (!(step.isInvalid()))) {
            (counter)++;
        }
    }
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        visitForPotentialSolutions(child);
    }
}