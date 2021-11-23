private void loadStepsFromMap() {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.ArrayList<java.lang.String> loadedSteps = ((java.util.ArrayList<java.lang.String>) (data.get(org.ejbca.core.model.approval.profile.ApprovalProfileBase.STEPS_KEY)));
    if ((loadedSteps != null) && ((loadedSteps.size()) > 0)) {
        steps = new java.util.HashMap<>();
        for (java.lang.String encodedStep : loadedSteps) {
            org.ejbca.core.model.approval.profile.ApprovalStep step = new org.ejbca.core.model.approval.profile.ApprovalStep(encodedStep);
            steps.put(step.getStepIdentifier(), step);
        }
    }
}