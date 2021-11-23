private void setUpGround() {
    testGround();
    grounds = new java.util.ArrayList<com.puffin.world.Ground>();
    map = new com.puffin.world.Maps();
    testGround();
    for (int i = 0; i < 10; i++) {
        com.puffin.world.Ground ground = map.next(world);
        addActor(ground);
        grounds.add(ground);
    }
}