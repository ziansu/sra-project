private easytests.models.IssueModelInterface map(easytests.entities.IssueEntity issueEntity) {
    if (issueEntity == null) {
        return null;
    }
    final easytests.models.IssueModelInterface issueModel = new easytests.models.IssueModel();
    issueModel.map(issueEntity);
    return issueModel;
}