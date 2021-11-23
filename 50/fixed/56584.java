public java.lang.String getCommentEscaped() {
    java.lang.String comment = this.getComment();
    comment = comment.replaceAll("\n", "<br>");
    return comment;
}