@javafx.fxml.FXML
void addSchedule() throws java.sql.SQLException {
    java.lang.String pickedDay = new java.lang.String(day.getSelectionModel().getSelectedItem());
    java.lang.String time = new java.lang.String(hour.getSelectionModel().getSelectedItem());
    db.modifySchedule(pickedDay, time, "BUSY");
    java.lang.System.out.println("OK");
    populate();
    javafx.stage.Stage stage = ((javafx.stage.Stage) (add.getScene().getWindow()));
    stage.close();
}