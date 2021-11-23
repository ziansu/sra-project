public static int getIntegerFromDirection(com.sun.javafx.scene.traversal.Direction direction) {
    switch (direction) {
        case LEFT :
            return 0;
        case UP :
            return 1;
        case RIGHT :
            return 2;
        case DOWN :
            return 3;
        default :
            return -1;
    }
}