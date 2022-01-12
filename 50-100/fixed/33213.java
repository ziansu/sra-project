@java.lang.Override
public void onClick(android.view.View v) {
    float[] mPoints = aptvLine.getPoints();
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.setScale(0.9F, 0.9F, 200, 0);
    matrix.mapPoints(mPoints);
    aptvLine.setPoints(mPoints);
}