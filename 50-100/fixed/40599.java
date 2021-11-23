@java.lang.Override
public void handle(javafx.scene.input.KeyEvent keyEvent) {
    switch (keyEvent.getCode()) {
        case ESCAPE :
            secondaryStage.close();
            closeSlideshow();
            break;
        case RIGHT :
            moveForwards();
            break;
        case LEFT :
            moveBackwards();
            break;
        default :
            break;
    }
}