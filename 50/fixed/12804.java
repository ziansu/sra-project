public java.util.List<hu.bme.sch.khongi.onlab.model.todo.Todo> getTodoListFromCategory(java.lang.String categoryName) {
    java.util.List<hu.bme.sch.khongi.onlab.model.todo.Todo> list = dataManager.getTodoListFromCategory(categoryName);
    return list;
}