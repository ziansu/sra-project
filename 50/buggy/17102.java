@javafx.fxml.FXML
private void removeSelectedClass() {
    com.testverktyg.eclipselink.service.Class.DeleteClass dc = new com.testverktyg.eclipselink.service.Class.DeleteClass();
    java.lang.String classToDelete = classList.getValue();
    dc.deleteClass(classToDelete);
    removeClassMessageLabel.setText((classToDelete + " är borttagen"));
    fillClasses(classList);
}