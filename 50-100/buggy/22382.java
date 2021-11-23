public void handleRemoveWorker() {
    java.util.Date currentDate = new java.util.Date();
    if ((assignedTask) != null) {
        assignedTask.setFinishDate(currentDate);
        assignedTask.setFinished(false);
        assignedTaskDAO.updateAssignedTask(assignedTask);
        setAssignedTask(null);
    }else {
        app.MainApp.showAlert(javafx.scene.control.Alert.AlertType.ERROR, "", "На дану роботу не призначено робітника!", "");
    }
}