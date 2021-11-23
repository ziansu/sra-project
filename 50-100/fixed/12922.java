private void showWindow(net.mready.hover.HoverWindow window) {
    if (window.attached) {
        return ;
    }
    windowManager.addView(window.windowView, window.windowLayoutParams);
    window.attached = true;
    if ((powerManager.isScreenOn()) && (!(keyguardManager.inKeyguardRestrictedInputMode()))) {
        window.performStart();
    }
}