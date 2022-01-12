private void visitForInvalids(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        if (isLeaf(child)) {
            if (child.isInvalid()) {
                (counter)++;
            }
        }else {
            visitForInvalids(child);
        }
    }
}