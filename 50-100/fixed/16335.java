@java.lang.SuppressWarnings(value = "unchecked")
public static java.util.ArrayList<com.cryo.utils.CommentDAO> getComments(int id) {
    java.util.ArrayList<com.cryo.utils.CommentDAO> comments = new java.util.ArrayList<>();
    java.lang.Object[] data = com.cryo.db.impl.ReportsConnection.connection().handleRequest("get-comments", id, 0);
    if (data == null)
        return comments;
    
    comments = ((java.util.ArrayList<com.cryo.utils.CommentDAO>) (data[0]));
    return comments;
}