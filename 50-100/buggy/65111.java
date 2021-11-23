private void setNewCommentVisible() {
    if ((gitHubIssue) == null) {
        return ;
    }
    boolean isVisible = !(gitHubIssue.isNew());
    newCommentLabel.setVisible(isVisible);
    newCommentTabbedPanel.setVisible(isVisible);
    newCommentButton.setVisible(isVisible);
    if (isVisible) {
        newCommentCloseReopenIssueButton.setVisible(gitHubIssue.isEditableUser());
    }else {
        newCommentCloseReopenIssueButton.setVisible(false);
    }
}