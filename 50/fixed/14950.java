@java.lang.Override
public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener newOnDoubleTapListener) {
    if (newOnDoubleTapListener != null)
        mGestureDetector.setOnDoubleTapListener(newOnDoubleTapListener);
    else
        mGestureDetector.setOnDoubleTapListener(new io.togoto.imagezoomcrop.photoview.DefaultOnDoubleTapListener(this));
    
}