@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    float trans = interpolatedTime * height;
    mToolbarLayout.setTranslationY((-trans));
    setWebViewTranslation((height - trans));
}