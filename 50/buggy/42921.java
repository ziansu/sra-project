private easytests.models.IssueModelInterface map(easytests.entities.IssueEntity issueEntity) {
    final easytests.models.IssueModelInterface issueModel = new easytests.models.IssueModel();
    issueModel.map(issueEntity);
    return issueModel;
}