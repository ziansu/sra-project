@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<java.lang.String> getComments(java.lang.String id) {
    org.bson.Document doc = getPostId(id);
    java.util.List<java.lang.String> comments = ((java.util.List<java.lang.String>) (doc.get("comments")));
    java.lang.System.out.println(comments);
    return comments;
}