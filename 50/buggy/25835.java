public boolean shootArrow() {
    if ((arrows) <= 0) {
        return false;
    }
    cost -= 10;
    (arrows)--;
    world.shootArrow(x, y, direction);
    return true;
}