protected boolean check() {
    float elapsedMiliSecs = ((java.lang.System.nanoTime()) - (lastUpdateTime)) / 1000000.0F;
    if (elapsedMiliSecs >= 500.0F) {
        lastUpdateTime = java.lang.System.nanoTime();
        npcc.setNearFlag(false);
        return true;
    }else
        return false;
    
}