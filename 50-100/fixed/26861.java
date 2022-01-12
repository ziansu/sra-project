public void closeProject() {
    if (de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().isUnsaved()) {
        javafx.scene.control.ButtonType choice = new de.uni_hannover.sra.minimax_simulator.gui.FXUnsavedDialog(_res.get("close-project.generic.title"), _res.get("close-project.generic.message")).getChoice();
        if (choice.equals(javafx.scene.control.ButtonType.YES)) {
            if (!(saveConfirmed())) {
                return ;
            }
        }else
            if (choice.equals(javafx.scene.control.ButtonType.CANCEL)) {
                return ;
            }
        
    }
    setDisable(true);
    de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().closeProject();
}