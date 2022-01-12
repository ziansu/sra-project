public net.minecraft.util.AxisAlignedBB getBoundingBox() {
    return new net.minecraft.util.AxisAlignedBB(this.pos.getX(), this.pos.getY(), this.pos.getZ(), ((this.pos.getX()) + 1), ((this.pos.getY()) + 1), ((this.pos.getZ()) + 1));
}