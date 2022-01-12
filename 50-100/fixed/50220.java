public boolean onClick(float x, float y) {
    for (com.italankin.fifteen.views.TopPanelView.Button b : mButtons) {
        if (b.contains(x, y)) {
            b.setOverlay(Settings.screenAnimDuration);
            if ((mCallbacks) != null) {
                mCallbacks.onTopPanelButtonClick(b.id);
            }
            return true;
        }
    }
    return false;
}