public static model.Direction parseDirection(java.lang.String name) {
    switch (name.toUpperCase()) {
        case "UP" :
            return model.Direction.UP;
        case "DOWN" :
            return model.Direction.DOWN;
        case "LEFT" :
            return model.Direction.LEFT;
        case "RIGHT" :
            return model.Direction.RIGHT;
        default :
            return null;
    }
}