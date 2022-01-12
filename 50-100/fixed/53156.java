public com.aix.city.core.Comment createComment(java.lang.String message) {
    long ID = 1;
    com.aix.city.core.User user = com.aix.city.core.AIXLoginModule.getInstance().getLoggedInUser();
    java.sql.Timestamp now = new java.sql.Timestamp(java.lang.System.currentTimeMillis());
    com.aix.city.core.Comment comment = new com.aix.city.core.Comment(ID, message, now, 0, user, false, event);
    getPosts().add(0, comment);
    return comment;
}