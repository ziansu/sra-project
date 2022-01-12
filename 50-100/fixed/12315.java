public java.lang.String createEditedCommentDetails() {
    teammates.ui.template.FeedbackResponseCommentRow frcRow = getComment();
    return (((("From: " + (frcRow.getCommentGiverName())) + " [") + (frcRow.getCreatedAt())) + "] ") + (frcRow.getEditedAt());
}