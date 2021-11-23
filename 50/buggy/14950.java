@java.lang.Override
public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener newOnDoubleTapListener) {
    if (newOnDoubleTapListener != null)
        this.mGestureDetector.setOnDoubleTapListener(newOnDoubleTapListener);
    else
        this.mGestureDetector.setOnDoubleTapListener(new io.togoto.imagezoomcrop.photoview.DefaultOnDoubleTapListener(this));
    
}