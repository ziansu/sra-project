public void loadDefaultSoduku(javafx.event.ActionEvent actionEvent) {
    checkResult.setText("");
    out.setText("");
    java.lang.String defaultName = listDefaultSoduku.getSelectionModel().getSelectedItem();
    sodukuSolver.setPlayfield(SodukuUtils.SodukuLoader.loadSoduku(defaultName));
    updatePlayfield();
}