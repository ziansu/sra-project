@java.lang.Override
public com.parse.ParseQuery create() {
    com.parse.ParseQuery query = new com.parse.ParseQuery("Task");
    query.whereEqualTo("user", currentUser);
    query.addDescendingOrder("createdAt");
    return query;
}