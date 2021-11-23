public static nbody.Planet getPlanet(nbody.In in) {
    nbody.Planet p = new nbody.Planet(0, 0, 0, 0, 0, "");
    p.x = in.readDouble();
    p.y = in.readDouble();
    p.xVelocity = in.readDouble();
    p.yVelocity = 10000;
    p.mass = in.readDouble();
    p.img = "images/" + (in.readString());
    return p;
}