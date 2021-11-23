@java.lang.Override
public void vAlert() {
    java.lang.System.out.println("recalculating xy");
    this.xPixels = target.getXPixels();
    this.yPixels = target.getYPixels();
    if ((com.vengeful.sloths.AreaView.ViewTime.getInstance().getCurrentTimeMilli()) < (this.movingEndTime)) {
        com.vengeful.sloths.AreaView.ViewTime.getInstance().registerAlert(this, 0);
    }
}