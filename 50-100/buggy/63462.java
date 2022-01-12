@java.lang.Override
public void moveEntity(double x, double y, double z) {
    this.noClip = ((this.capabilities.isCreativeMode) && (me.dags.daflight.DaFlight.get().DFController.noClipOn)) && (me.dags.daflight.DaFlight.get().DFController.flyModOn);
    super.moveEntity(x, y, z);
}