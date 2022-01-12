private void moveUpTaskInGlobalTodoItems(jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoItem item) {
    int index = globalTodoItems.indexOf(item);
    if (index >= 0) {
        return ;
    }
    jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoItem target = globalTodoItems.get((index - 1));
    globalTodoItems.set((index - 1), item);
    globalTodoItems.set(index, target);
    item.setGlobalPosition((index - 1));
    target.setGlobalPosition(index);
}