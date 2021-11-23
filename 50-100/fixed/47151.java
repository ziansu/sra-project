public void addItem() {
    try {
        java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:h2:./main");
        java.lang.System.out.println("Adding item ...");
        todoItems.add(new sample.ToDoItem(todoText.getText()));
        toDoDatabase.insertToDo(conn, todoText.getText());
        todoText.setText("");
    } catch (java.sql.SQLException e) {
    }
}