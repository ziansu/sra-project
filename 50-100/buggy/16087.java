private void setSearchCommentsForStudentsTables(teammates.common.datatransfer.CommentSearchResultBundle commentSearchResultBundle) {
    searchCommentsForStudentsTables = new java.util.ArrayList<teammates.ui.template.CommentsForStudentsTable>();
    for (java.lang.String giverEmailPlusCourseId : commentSearchResultBundle.giverCommentTable.keySet()) {
        java.lang.String giverDetails = commentSearchResultBundle.giverTable.get(giverEmailPlusCourseId);
        searchCommentsForStudentsTables.add(new teammates.ui.template.CommentsForStudentsTable(commentSearchResultBundle));
        giverDetails.createCommentRows(giverEmailPlusCourseId);
    }
}