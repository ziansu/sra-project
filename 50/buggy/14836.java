@java.lang.Override
public com.parse.ParseQuery create() {
    android.util.Log.d("TASKS_ADAPTER", currentUser);
    com.parse.ParseQuery query = new com.parse.ParseQuery("Task");
    query.whereEqualTo("user", currentUser);
    query.addDescendingOrder("createdAt");
    return query;
}