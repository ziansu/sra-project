private long getNavBarShowDelay() {
    if (mStatusBar.isKeyguardFadingAway()) {
        return mStatusBar.getKeyguardFadingAwayDelay();
    }else
        if (mBouncer.isShowing()) {
            return com.android.systemui.statusbar.phone.StatusBarKeyguardViewManager.NAV_BAR_SHOW_DELAY_BOUNCER;
        }else {
            return 0;
        }
    
}