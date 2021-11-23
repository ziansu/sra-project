public void refreshArcLoaderDrawable(com.leo.simplearcloader.ArcConfiguration configuration) {
    if (isRunning())
        stop();
    
    mArcDrawable = new com.leo.simplearcloader.SimpleArcLoader.ArcDrawable(configuration, this);
    setBackgroundDrawable(mArcDrawable);
    start();
}