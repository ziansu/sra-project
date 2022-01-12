public void handleRemoveWorker() {
    java.util.Date currentDate = new java.util.Date();
    updateAssignedTask();
    if ((assignedTask) != null) {
        assignedTask.setFinishDate(currentDate);
        assignedTask.setFinished(false);
        assignedTaskDAO.updateAssignedTask(assignedTask);
        updateAssignedTask();
    }else {
        app.MainApp.showAlert(javafx.scene.control.Alert.AlertType.ERROR, "", "На дану роботу не призначено робітника!", "");
    }
}