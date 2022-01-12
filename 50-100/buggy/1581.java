public void saveProjectAs() {
    fc.getExtensionFilters().clear();
    fc.getExtensionFilters().add(extFilterProject);
    java.io.File file = fc.showSaveDialog(de.uni_hannover.sra.minimax_simulator.Main.getPrimaryStage());
    new de.uni_hannover.sra.minimax_simulator.ui.actions.ProjectSaveTo().save(file);
}