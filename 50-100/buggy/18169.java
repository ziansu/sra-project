public void setTime(long timeUTC) {
    this.timeUTC = timeUTC;
    if (!(isLamp)) {
        light.setTime(timeUTC, gov.nasa.arc.dert.landscape.Landscape.getInstance().getGlobeName(), "Sun", getRefLoc());
        gov.nasa.arc.dert.scene.World.getInstance().getMarble().setSolarDirection(getLightDirection());
    }
}