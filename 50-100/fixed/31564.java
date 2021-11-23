public void addItem() {
    try {
        java.lang.System.out.println("Adding item ...");
        int id = myToDoDatabase.insertToDo(conn, todoText.getText(), currentUser.id);
        sample.ToDoItem newToDoItem = new sample.ToDoItem(id, todoText.getText());
        todoItems.add(newToDoItem);
        todoText.setText("");
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println("Exception caught inserting toDo");
        ex.printStackTrace();
    }
}