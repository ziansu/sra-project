private int initializeOnContactChange(double initialTime) {
    int numberOfFootstepsToConsider = clipNumberOfFootstepsToConsiderToProblem(this.numberOfFootstepsToConsider.getIntegerValue());
    this.initialTime.set(initialTime);
    speedUpTime.set(0.0);
    setProblemBooleans();
    beginningOfStateICP.set(solutionHandler.getControllerReferenceICP());
    beginningOfStateICPVelocity.set(solutionHandler.getControllerReferenceICPVelocity());
    if (useFootstepRegularization)
        resetFootstepRegularizationTask();
    
    if (useFeedbackRegularization)
        solver.resetFeedbackRegularization();
    
    return numberOfFootstepsToConsider;
}