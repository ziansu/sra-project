public android.graphics.Canvas getCanvas() {
    android.graphics.Canvas canva = sView.getHolder().lockCanvas();
    if (canva != null) {
        canva.drawBitmap(backGround, null, new android.graphics.Rect(0, 0, sView.getLayoutParams().width, sView.getLayoutParams().height), null);
    }
    return canva;
}