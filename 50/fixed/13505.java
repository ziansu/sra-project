void bringToFront(net.mready.hover.HoverWindow window) {
    if (!(window.attached)) {
        return ;
    }
    windowManager.removeView(window.windowView);
    windowManager.addView(window.windowView, window.windowLayoutParams);
}