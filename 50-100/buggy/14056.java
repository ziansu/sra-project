public int autoThreshold() {
    double threshold = getAutoThreshold(10);
    java.lang.System.out.println(("Auto detected threshold : " + (getThresholdValue())));
    setThresholdValue(knop.psfj.utils.MathUtils.round(threshold));
    setProgress(100, "Done.");
    setChanged();
    notifyObservers(new knop.psfj.view.Message(this, knop.psfj.BeadImage.MSG_THRESHOLD_CHANGED));
    return getThresholdValue();
}