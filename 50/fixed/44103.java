public boolean saveProject() {
    return new de.uni_hannover.sra.minimax_simulator.ui.actions.ProjectSave().save(de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().getCurrentProjectFile());
}