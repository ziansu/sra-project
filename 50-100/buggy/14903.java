@java.lang.Override
public boolean onScale(android.view.ScaleGestureDetector detector) {
    if ((touchImageViewListener) != null) {
        touchImageViewListener.onMove();
    }
    scaleImage(detector.getScaleFactor(), detector.getFocusX(), detector.getFocusY(), true);
    return true;
}