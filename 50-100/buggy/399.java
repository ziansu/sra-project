void update(final int flags, final org.cyanogenmod.platform.internal.display.LiveDisplayService.State state) {
    mState = state;
    if ((flags & (org.cyanogenmod.platform.internal.display.LiveDisplayService.DISPLAY_CHANGED)) != 0) {
        onScreenStateChanged();
    }
    if (((flags & (org.cyanogenmod.platform.internal.display.LiveDisplayService.TWILIGHT_CHANGED)) != 0) && ((mState.mTwilight) != null)) {
        onTwilightUpdated();
    }
    if ((flags & (org.cyanogenmod.platform.internal.display.LiveDisplayService.MODE_CHANGED)) != 0) {
        onUpdate();
    }
    if ((flags & (org.cyanogenmod.platform.internal.display.LiveDisplayService.ALL_CHANGED)) != 0) {
        onSettingsChanged(null);
    }
}