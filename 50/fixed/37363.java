public synchronized void saveComment(com.springframework.model.Comment comment) {
    allComments.add(comment);
    com.springframework.dbModels.CommentDao.getInstance().saveCommentToDB(comment);
}