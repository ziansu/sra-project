private void drawZeroZeroZero() {
    android.graphics.Canvas canvas = null;
    try {
        canvas = this.lockCanvas();
        if (canvas == null)
            return ;
        
        this.drawTimeAndBackground(canvas, java.lang.String.format(locale, com.camnter.easycountdowntextureview.EasyCountDownTextureView.LESS_THAN_TEN_FORMAT, 0), java.lang.String.format(locale, com.camnter.easycountdowntextureview.EasyCountDownTextureView.LESS_THAN_TEN_FORMAT, 0), java.lang.String.format(locale, com.camnter.easycountdowntextureview.EasyCountDownTextureView.LESS_THAN_TEN_FORMAT, 0));
        unlockCanvasAndPost(canvas);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        unlockCanvasAndPost(canvas);
    }
}