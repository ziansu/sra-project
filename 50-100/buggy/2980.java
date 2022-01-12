public void add(me.newyith.util.Point p) {
    if ((p != null) && ((p.getWorld()) == (this.getWorld()))) {
        this.x += p.x;
        this.y += p.y;
        this.z += p.z;
        this.setX(this.x);
        this.setY(this.y);
        this.setZ(this.z);
    }else {
        throw new java.lang.IllegalArgumentException("Cannot add Locations of differing worlds");
    }
}