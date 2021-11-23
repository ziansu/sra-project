public void validate(org.cgiar.ccafs.ap.action.BaseAction action, org.cgiar.ccafs.ap.data.model.Project project) {
    if (project != null) {
        boolean problem = false;
        boolean result;
        result = this.validateEmptyFields(action, project);
        if (!result) {
            problem = true;
        }
        result = this.validateLeaderAndCoordinator(action, project);
        if (result) {
            problem = true;
        }
        if (!problem) {
            result = this.validateRepeatedPartners(action, project);
        }
    }
}