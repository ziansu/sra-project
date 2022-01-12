@java.lang.Override
public boolean onScale(android.view.ScaleGestureDetector detector) {
    scaleImage(detector.getScaleFactor(), detector.getFocusX(), detector.getFocusY(), true);
    if ((touchImageViewListener) != null) {
        touchImageViewListener.onMove();
    }
    return true;
}