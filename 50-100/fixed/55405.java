@java.lang.Override
public void addTodoList(com.google.api.services.tasks.model.TaskList taskList, java.util.List<com.google.api.services.tasks.model.Task> tasks, int color) {
    if (taskList != null) {
        jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoList polyTodoList = new jp.gr.java_conf.shioyang.polyhedraltodolist.polyimpl.PolyTodoListImpl(taskList, (tasks != null ? tasks : new java.util.ArrayList<com.google.api.services.tasks.model.Task>()), color);
        if (polyTodoList.isPolyTodoList()) {
            todoLists.add(polyTodoList);
            java.util.List<jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoItem> polyTodoItems = polyTodoList.getLocalList();
            mergePolyTodoItemsLast(polyTodoItems);
        }
    }
}