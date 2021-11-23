public com.aventura.model.world.World createWorld() {
    com.aventura.model.world.World world = new com.aventura.model.world.World();
    com.aventura.model.world.Element e = world.createElement();
    com.aventura.math.transform.Rotation r = new com.aventura.math.transform.Rotation(0, com.aventura.math.vector.Vector3.Z_AXIS);
    com.aventura.math.transform.Scaling s = new com.aventura.math.transform.Scaling(1);
    com.aventura.model.world.Trellis trel = new com.aventura.model.world.Trellis(3, 2, 2, 1);
    java.lang.System.out.println(trel);
    world.addElement(trel);
    return world;
}