private boolean protect(me.newyith.util.Point p) {
    boolean pointProtected = false;
    org.bukkit.block.Block b = p.getBlock();
    if (me.newyith.generator.Wall.isProtectableWallMaterial(b.getType())) {
        this.protectedPoints.add(p);
        pointProtected = true;
    }
    return pointProtected;
}