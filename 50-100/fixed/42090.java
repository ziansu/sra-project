@java.lang.Override
public void updateItem(sg.edu.nus.cs2103t.omnitask.model.Task task, boolean empty) {
    super.updateItem(task, empty);
    if (empty || (task == null)) {
        setGraphic(null);
        setText(null);
    }else
        if (task != null) {
            sg.edu.nus.cs2103t.omnitask.ui.TaskItemController data = new sg.edu.nus.cs2103t.omnitask.ui.TaskItemController();
            data.setData(task);
            setGraphic(data.getView());
        }
    
}