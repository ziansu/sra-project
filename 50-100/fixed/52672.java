private void visitForGroundSolution(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    if ((step.isSolution()) && (step.isGround())) {
        (counter)++;
    }
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        visitForGroundSolution(child);
    }
}