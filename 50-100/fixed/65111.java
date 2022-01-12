private void setNewCommentVisible(boolean isVisible) {
    newCommentLabel.setVisible(isVisible);
    newCommentTabbedPanel.setVisible(isVisible);
    newCommentButton.setVisible(isVisible);
    if (isVisible) {
        newCommentCloseReopenIssueButton.setVisible(gitHubIssue.isEditableUser());
    }else {
        newCommentCloseReopenIssueButton.setVisible(false);
    }
}