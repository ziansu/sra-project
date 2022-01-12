public void setHit(boolean isHit) {
    this.isHit = isHit;
    if (!(name.contains("water"))) {
        java.lang.System.out.println(name);
        try {
            component.setActiveAnimationIndex((isHit ? 1 : 0));
        } catch (java.lang.IllegalArgumentException iae) {
            de.hsb.ismi.jbs.engine.utility.debug.DebugLog.logError(iae);
        }
    }
}