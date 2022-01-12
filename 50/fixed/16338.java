public void tick() {
    for (int i = 0; i < (object.size()); i++) {
        tempObject = object.get(i);
        tempObject.tick();
    }
}