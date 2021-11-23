private void visitForPotentialSolutions(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        if (isLeaf(child)) {
            if ((!(child.isDuplicate())) && (!(child.isInvalid()))) {
                (counter)++;
            }
        }else {
            visitForPotentialSolutions(child);
        }
    }
}