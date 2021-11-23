private void newItemBtnActionPerformed(java.awt.event.ActionEvent evt) {
    com.mrjaffesclass.apcs.todolist.ToDoItem item = new com.mrjaffesclass.apcs.todolist.ToDoItem((-1), "New to do item", false, new java.util.Date());
    editItem(item);
}