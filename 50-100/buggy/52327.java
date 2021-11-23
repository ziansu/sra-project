public boolean updateProject(java.lang.Long id, java.lang.Long submissionType, java.lang.String workflowStatus, java.lang.String submissionStatus, Models.Timestamp creationDate, Models.Timestamp amendmentDate, java.lang.String projectReadinessElements, java.lang.String projectSelectionInformation, java.lang.String tbpApproval, java.lang.String stateApproval, java.lang.String federalApproval) {
    Models.ProposedProject newProject = new Models.ProposedProject(submissionType, workflowStatus, submissionStatus, creationDate, amendmentDate, projectReadinessElements, projectSelectionInformation, tbpApproval, stateApproval, federalApproval);
    Database.ProposedProjectManager db = new Database.ProposedProjectManager();
    return db.updateProject(newProject, id);
}