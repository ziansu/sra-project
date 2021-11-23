private void init(android.util.AttributeSet attributeSet) {
    com.leo.simplearcloader.ArcConfiguration configuration = readFromAttributes(attributeSet);
    mArcDrawable = new com.leo.simplearcloader.SimpleArcLoader.ArcDrawable(configuration);
    setBackgroundDrawable(mArcDrawable);
    start();
}