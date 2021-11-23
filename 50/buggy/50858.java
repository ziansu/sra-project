@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    readMarkerView.setVisibility(View.GONE);
    if ((mReadMarkerListener) != null) {
        mReadMarkerListener.onReadMarkerDisplayed(event, readMarkerView);
    }
}