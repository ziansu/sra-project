public void toggleCurrentAssignmentOnly(javafx.event.Event event) {
    if ((listener) == null)
        return ;
    
    javafx.scene.control.ToggleButton toggleButton = ((javafx.scene.control.ToggleButton) (event.getSource()));
    if (toggleButton.isSelected()) {
        java.lang.String assignment = listener.getCurrentAssignment();
        pastaManager.setAssignment(assignment);
    }else {
        pastaManager.setAssignment(null);
    }
    updateFilteredList();
}