private void calcPath() {
    java.util.ArrayList<net.minecraft.util.math.Vec3d> path = new java.util.ArrayList<net.minecraft.util.math.Vec3d>();
    while ((!(this.hasHit)) && ((this.posY) > 0)) {
        net.minecraft.util.math.Vec3d pos = new net.minecraft.util.math.Vec3d(this.posX, this.posY, this.posZ);
        path.add(pos);
        this.onUpdate();
    } 
    this.path = path.toArray(new net.minecraft.util.math.Vec3d[path.size()]);
}