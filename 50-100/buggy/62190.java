@java.lang.Override
public void setSize(int width, int height) {
    java.lang.String info = java.lang.String.format(java.util.Locale.getDefault(), "MainActivity: Size in Pixel: -------------> %d, %d", width, height);
    android.util.Log.v(BezierGlobals.TAG, info);
    this.viewWidth = width;
    this.viewHeight = height;
    android.util.DisplayMetrics dm = new android.util.DisplayMetrics();
    this.getWindowManager().getDefaultDisplay().getMetrics(dm);
    de.peterloos.beziersplines.utils.BezierUtils.calculateCellLengths(dm, width, height);
    this.bezierViewWithGrid.setDensityOfGridlines(gridlinesFactor);
}