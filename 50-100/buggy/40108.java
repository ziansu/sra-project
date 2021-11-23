@java.lang.Override
protected void updateServerSide() {
    if (fillFluid()) {
        this.isDirty = true;
    }
    if (needsUpdate(20)) {
        this.isDirty = isRefilling();
    }
    if (this.isDirty) {
        this.world.updateComparatorOutputLevel(this.pos, getBlockType());
        this.sendUpdatePacket();
        markAsDirty(getPos());
        this.isDirty = false;
    }
}