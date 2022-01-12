public coord.Cartesian toCartesian() {
    coord.Cartesian cart = new coord.Cartesian();
    cart.setX((((r) * (java.lang.Math.sin(theta))) * (java.lang.Math.cos(fi))));
    cart.setY((((r) * (java.lang.Math.sin(theta))) * (java.lang.Math.sin(fi))));
    cart.setZ(((r) * (java.lang.Math.cos(fi))));
    return cart;
}