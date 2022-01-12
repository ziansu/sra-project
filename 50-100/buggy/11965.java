public void setLanecover(float lanecover) {
    this.lanecover = lanecover;
    if ((this.fixhispeed) != (bms.player.beatoraja.Config.FIX_HISPEED_OFF)) {
        hispeed = ((float) ((((2400.0F / ((basebpm) / 100)) / (gvalue)) * 0.6) * (1 - (enableLanecover ? lanecover : 0))));
    }
}