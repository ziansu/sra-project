@java.lang.Override
public void p2Win(android.graphics.Point winPoint) {
    android.util.Log.d("INTERFACE", "p2win called");
    screenLayout.addView(holderLayout);
    relativeLayout.addView(screenLayout);
    screenTextView.setText("P2++");
    subtitleTextView.setText("Tap to Continue");
    final android.view.animation.Animation in = new android.view.animation.AlphaAnimation(0.0F, 1.0F);
    in.setDuration(100);
    screenTextView.setAnimation(in);
    subtitleTextView.setAnimation(in);
}