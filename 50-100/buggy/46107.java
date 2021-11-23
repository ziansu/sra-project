@java.lang.Override
protected boolean pushOutOfBlocks(double x, double y, double z) {
    if (((this.capabilities.isCreativeMode) && (me.dags.daflight.DaFlight.get().DFController.noClipOn)) && (me.dags.daflight.DaFlight.get().DFController.flyModOn)) {
        this.noClip = true;
    }
    return super.pushOutOfBlocks(x, y, z);
}