private void initialise() {
    this.items = new java.util.ArrayList<main.java.gui.TasksItemController>();
    this.tasksDisplay.setItems(javafx.collections.FXCollections.observableList(items));
}