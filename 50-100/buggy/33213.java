@java.lang.Override
public void onClick(android.view.View v) {
    float[] mPoints = aptvLine.getPoints();
    com.zxb.libsdemo.util.J.j(mPoints);
    android.graphics.Matrix matrix = new android.graphics.Matrix();
    matrix.setScale(0.9F, 0.9F, 200, 0);
    matrix.mapPoints(mPoints);
    aptvLine.setPoints(mPoints);
    com.zxb.libsdemo.util.J.j(mPoints);
}