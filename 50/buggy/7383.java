public void drawBackground(android.graphics.Canvas canvas) {
    if ((mAmbient) && ((!(mLowBitAmbient)) || (mBurnInProtection))) {
        canvas.drawColor(Color.BLACK);
    }else {
        canvas.drawColor(mCenterCircleColor);
    }
}