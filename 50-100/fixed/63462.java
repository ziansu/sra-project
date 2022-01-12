@java.lang.Override
public void moveEntity(double x, double y, double z) {
    if ((me.dags.daflight.DaFlight.get().DFController.noClipOn) && (me.dags.daflight.DaFlight.get().DFController.flyModOn))
        this.noClip = true;
    
    super.moveEntity(x, y, z);
}