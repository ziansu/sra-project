public boolean isAlive() {
    for (int i = 1; i < (segment.length); i++) {
        if (((segments.get(0).getX()) == (segment.get(i).getX())) && ((segments.get(0).getY()) == (segment.get(i).getY()))) {
            alive = false;
        }
    }
    return alive;
}