public com.aventura.model.world.World createWorld() {
    com.aventura.model.world.World world = new com.aventura.model.world.World();
    com.aventura.model.world.Element e = world.createElement();
    com.aventura.model.world.Trellis trel = new com.aventura.model.world.Trellis(3, 2, 2, 1);
    java.lang.System.out.println(trel);
    world.addElement(trel);
    return world;
}