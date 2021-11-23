@javafx.fxml.FXML
public void removeBreakpoint(javafx.event.ActionEvent event) {
    java.lang.String breakpoint = breakpoint_list.getSelectionModel().getSelectedItem();
    observableBreakpoints.remove(breakpoint);
    java.lang.System.out.println(("Removed breakpoint: " + breakpoint));
}