@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    DataModel = Model.Sync.getInstance();
    FencerColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("fullName"));
    FencingSchoolColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("fencingSchool"));
    AgeColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("birthday"));
    TournamentColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("name"));
    DateColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("date"));
    UpdateView();
}