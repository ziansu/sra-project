public boolean isAlive() {
    for (int i = 1; i < (segments.size()); i++) {
        if (((segments.get(0).getX()) == (segments.get(i).getX())) && ((segments.get(0).getY()) == (segments.get(i).getY()))) {
            alive = false;
        }
    }
    return alive;
}