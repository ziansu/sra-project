@java.lang.Override
public boolean shouldHideFlash() {
    return (!(useStillshot())) || ((mFlashModes) == null);
}