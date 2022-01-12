public static DatabaseController.CommentDTO fromModel(modelPOJO.Comment comment) {
    DatabaseController.CommentDTO dto = new DatabaseController.CommentDTO();
    dto.setSubmitDate(comment.getSubmitDate());
    dto.setCommenter(comment.getCommenter());
    dto.setMessage(comment.getMessage());
    dto.setCommentID(comment.getCommentID());
    dto.setTaskID(comment.getTaskID());
    return dto;
}