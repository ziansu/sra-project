@java.lang.Override
public void decode() {
    cn.nukkit.math.BlockVector3 v = this.getBlockCoords();
    this.z = v.z;
    this.y = v.y;
    this.x = v.x;
}