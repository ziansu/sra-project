public java.lang.String createEditedCommentDetails() {
    teammates.ui.template.FeedbackResponseCommentRow frcRow = getComment();
    java.lang.String editedCommentHeader = (((("From: " + (frcRow.getCommentGiverName())) + " [") + (frcRow.getCreatedAt())) + "] ") + (frcRow.getEditedAt());
    return editedCommentHeader;
}