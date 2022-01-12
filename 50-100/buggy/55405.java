@java.lang.Override
public void addTodoList(com.google.api.services.tasks.model.TaskList taskList, java.util.List<com.google.api.services.tasks.model.Task> tasks, int color) throws java.lang.Exception {
    if ((taskList == null) && (tasks == null))
        throw new java.lang.Exception();
    
    jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoList polyTodoList = new jp.gr.java_conf.shioyang.polyhedraltodolist.polyimpl.PolyTodoListImpl(taskList, tasks, color);
    if (polyTodoList.isPolyTodoList()) {
        todoLists.add(polyTodoList);
        java.util.List<jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoItem> polyTodoItems = polyTodoList.getLocalList();
        mergePolyTodoItemsLast(polyTodoItems);
    }
}