private void reDrawGestureView() {
    android.util.Log.i("RESET", " GESTURE");
    setContentView(R.layout.save_gesture);
    resetButton = ((android.widget.Button) (findViewById(R.id.gesture_reset_button)));
    resetButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            reDrawGestureView();
        }
    });
    android.gesture.GestureOverlayView gestures = ((android.gesture.GestureOverlayView) (findViewById(R.id.save_gesture)));
    gestures.removeAllOnGestureListeners();
    gestures.addOnGestureListener(mGestureListener);
    resetEverything();
}