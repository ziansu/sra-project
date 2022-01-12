private com.google.gerrit.server.change.PostReviewers.Addition addAssigneeAsCC(com.google.gerrit.server.change.ChangeResource rsrc, java.lang.String assignee) throws com.google.gerrit.extensions.restapi.RestApiException, com.google.gwtorm.server.OrmException, java.io.IOException {
    com.google.gerrit.extensions.api.changes.AddReviewerInput reviewerInput = new com.google.gerrit.extensions.api.changes.AddReviewerInput();
    reviewerInput.reviewer = assignee;
    reviewerInput.state = com.google.gerrit.extensions.client.ReviewerState.CC;
    reviewerInput.confirmed = true;
    reviewerInput.notify = com.google.gerrit.extensions.api.changes.NotifyHandling.NONE;
    return postReviewers.prepareApplication(rsrc, reviewerInput, false);
}