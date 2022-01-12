private void saveConfirmed() {
    if ((de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().getCurrentProjectFile()) == null) {
        saveProjectAs();
    }else {
        saveProject();
    }
}