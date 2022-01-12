public void add(me.newyith.util.Point p) {
    if ((p != null) && ((p.getWorld()) == (this.getWorld()))) {
        this.x += p.x;
        this.y += p.y;
        this.z += p.z;
    }else {
        throw new java.lang.IllegalArgumentException("Cannot add Locations of differing worlds");
    }
}