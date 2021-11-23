@javafx.fxml.FXML
public void updateAct(javafx.scene.input.MouseEvent arg0) {
    se.kth.csc.iprog.agendabuilder.model.Activity activity = list.getSelectionModel().getSelectedItem();
    if ((!(activity == null)) || (!(activity.editing))) {
        activity.editing = true;
        new se.kth.csc.iprog.agendabuilder.view.EditActivity(model, activity, day);
    }
}