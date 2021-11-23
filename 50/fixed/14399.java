public static com.sun.javafx.scene.traversal.Direction getDirectionFromInteger(int integer) {
    switch (integer) {
        case 0 :
            return com.sun.javafx.scene.traversal.Direction.LEFT;
        case 1 :
            return com.sun.javafx.scene.traversal.Direction.UP;
        case 2 :
            return com.sun.javafx.scene.traversal.Direction.RIGHT;
        case 3 :
            return com.sun.javafx.scene.traversal.Direction.DOWN;
        default :
            return null;
    }
}