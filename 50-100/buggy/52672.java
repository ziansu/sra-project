private void visitForGroundSolution(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        if (isLeaf(child)) {
            if ((child.isSolution()) && (child.isGround())) {
                (counter)++;
            }
        }else {
            visitForGroundSolution(child);
        }
    }
}