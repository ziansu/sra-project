private boolean saveConfirmed() {
    if ((de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().getCurrentProjectFile()) == null) {
        return saveProjectAs();
    }else {
        return saveProject();
    }
}