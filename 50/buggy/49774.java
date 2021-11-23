@java.lang.Override
public synchronized void modifyLandValue(double factor) {
    this.landValue += factor;
    edu.mscd.thesis.util.Util.boundValue(landValue, this.baseLandValue(), Rules.MAX);
}