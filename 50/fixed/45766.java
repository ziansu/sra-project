public void putDirection(org.newdawn.slick.geom.Vector2f dir) throws java.lang.Exception {
    if ((this.dir) == null) {
        this.dir = dir;
    }else {
        throw new java.lang.Exception("Direction already set");
    }
}