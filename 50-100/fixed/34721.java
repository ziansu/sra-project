protected final boolean setSwapIntervalNC(final int interval) throws com.jogamp.opengl.GLException {
    if ((!(drawableRetargeted)) || (!(hasRendererQuirk(GLRendererQuirks.NoSetSwapIntervalPostRetarget)))) {
        final java.lang.Integer usedInterval = setSwapIntervalImpl2(interval);
        if (null != usedInterval) {
            currentSwapInterval = usedInterval.intValue();
            return true;
        }
    }
    return false;
}