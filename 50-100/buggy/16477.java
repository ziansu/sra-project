public android.graphics.Path getPath() {
    android.graphics.Path path = new android.graphics.Path();
    float heightFall = pageTransFormer.getHeightFall();
    float translationX = pageTransFormer.getTranslationX();
    float pathStartY = heightFall + (0.5F * (measuredHeight));
    path.moveTo((-translationX), pathStartY);
    path.quadTo(((measuredWidth) / 2), measuredHeight, ((measuredWidth) + translationX), pathStartY);
    return path;
}