@java.lang.Override
public void setSize(int width, int height) {
    this.viewWidth = width;
    this.viewHeight = height;
    android.util.DisplayMetrics dm = new android.util.DisplayMetrics();
    this.getWindowManager().getDefaultDisplay().getMetrics(dm);
    de.peterloos.beziersplines.utils.BezierUtils.calculateCellLengths(dm, width, height);
    this.bezierViewWithGrid.setDensityOfGridlines(gridlinesFactor);
}