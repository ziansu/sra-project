@java.lang.Override
public void handle(javafx.scene.input.KeyEvent event) {
    switch (event.getCode()) {
        case W :
        case UP :
        case S :
        case DOWN :
            upDown = 0;
            break;
        case D :
        case RIGHT :
        case A :
        case LEFT :
            leftRight = 0;
            break;
        default :
            return ;
    }
    moveCamera(new com.neuronrobotics.sdk.addons.kinematics.math.TransformNR(leftRight, upDown, 0, new com.neuronrobotics.sdk.addons.kinematics.math.RotationNR()), 0);
    event.consume();
}