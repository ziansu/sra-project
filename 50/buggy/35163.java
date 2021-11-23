public void onClick(android.view.View v) {
    java.lang.String message = "3";
    sendMessage(message);
    vibrator.vibrate(100);
    m3Background.setBackgroundResource(R.drawable.button_shape_bule);
    pushedNumber = 0;
    pushedButton = m3Background;
}