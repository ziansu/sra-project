@java.lang.Override
public void run() {
    android.graphics.Paint paint = new android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG);
    float textSize = java.lang.Math.min(((viewHeight) * (MarqueeTextView.TEXT_SCALE)), MarqueeTextView.TEXT_MAX_SIZE);
    paint.setTextSize(textSize);
    int bufferWidth = 100;
    textParts = splitByTextWidth(marqueeInfo.getText(), ((viewWidth) + bufferWidth), paint);
    for (java.lang.String textPart : textParts) {
        android.util.Log.d(com.potterhsu.marqueetextview.MarqueeTextFragment.TAG, ("textPart: " + textPart));
    }
    startMarquee();
}