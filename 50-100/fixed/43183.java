public void startGame() {
    java.lang.System.out.println("started game");
    gameSpeed.start();
    mani = new Manipulator(this);
    dirty = new Block(400, 200, 200, 200, 2);
    bouncy = new Block(600, 200, 200, 200, 0);
    mani.addObject(bouncy);
    mani.addObject(dirty);
}