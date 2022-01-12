private void preparePaint(@com.taobao.weex.ui.view.border.BorderWidthStyleColorType
int side) {
    float borderWidth = getBorderWidth(side);
    int color = com.taobao.weex.utils.WXViewUtils.multiplyColorAlpha(getBorderColor(side), mAlpha);
    com.taobao.weex.ui.view.border.BorderStyle borderStyle = com.taobao.weex.ui.view.border.BorderStyle.values()[getBorderStyle(side)];
    android.graphics.Shader shader = borderStyle.getLineShader(borderWidth, color, side);
    mPaint.setShader(shader);
    mPaint.setColor(color);
    mPaint.setStrokeWidth(borderWidth);
    mPaint.setStrokeCap(Paint.Cap.ROUND);
}