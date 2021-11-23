@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((controlPanel.createRoomControl) != null)
        controlPanel.createRoomControl.setDisable(false);
    
    mainFrm.mazePanel.createMaze(false);
}