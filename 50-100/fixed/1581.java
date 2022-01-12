public boolean saveProjectAs() {
    fc.getExtensionFilters().clear();
    fc.getExtensionFilters().add(extFilterProject);
    java.io.File file = fc.showSaveDialog(de.uni_hannover.sra.minimax_simulator.Main.getPrimaryStage());
    return new de.uni_hannover.sra.minimax_simulator.ui.actions.ProjectSaveTo().save(file);
}