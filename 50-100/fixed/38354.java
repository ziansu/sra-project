public void onUpdateNavigation() {
    ++(this.totalTicks);
    if (!(this.noPath())) {
        net.minecraft.util.Vec3 vec3 = this.currentPath.getPosition(this.theEntity);
        if (vec3 != null) {
            this.theEntity2.getShipMoveHelper().setMoveTo(vec3.xCoord, vec3.yCoord, vec3.zCoord, this.speed);
        }
        if (this.canNavigate()) {
            this.pathFollow();
        }
    }
}