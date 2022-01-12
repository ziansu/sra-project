private final void moveUp(int steps) {
    if ((y_coord) < steps) {
        y_coord = (Params.world_height) - (steps - (y_coord));
    }else {
        y_coord = (y_coord) - steps;
    }
}