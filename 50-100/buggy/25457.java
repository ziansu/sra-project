@java.lang.Override
public void handle(javafx.scene.input.KeyEvent event) {
    switch (event.getCode()) {
        case W :
        case UP :
            upDown = modifier;
            break;
        case S :
        case DOWN :
            upDown = -modifier;
            break;
        case D :
        case RIGHT :
            leftRight = -modifier;
            break;
        case A :
        case LEFT :
            leftRight = modifier;
            break;
        default :
            return ;
    }
    moveCamera(new com.neuronrobotics.sdk.addons.kinematics.math.TransformNR(leftRight, upDown, 0, new com.neuronrobotics.sdk.addons.kinematics.math.RotationNR()), 0);
    event.consume();
}