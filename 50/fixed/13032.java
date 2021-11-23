public void init(int arcColor, int arcWidth, boolean roundedStroke) {
    com.github.jorgecastilloprz.progressarc.ProgressArcDrawable arcDrawable = new com.github.jorgecastilloprz.progressarc.ProgressArcDrawable(arcWidth, arcColor, roundedStroke);
    setIndeterminateDrawable(arcDrawable);
    setupInitialAlpha();
}