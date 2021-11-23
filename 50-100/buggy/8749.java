private void reDrawGestureView() {
    dist = 0;
    android.util.Log.i("Action", "RESET GESTURE");
    setContentView(R.layout.test_gesture);
    resetButton = ((android.widget.Button) (findViewById(R.id.gesture_test_button)));
    resetButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            reDrawGestureView();
        }
    });
    android.gesture.GestureOverlayView gestures = ((android.gesture.GestureOverlayView) (findViewById(R.id.test_gesture)));
    gestures.removeAllOnGestureListeners();
    gestures.addOnGestureListener(mGestureListener);
    resetEverything();
}