public void repaint() {
    if (settings.isConsoleMode()) {
        consoleDisplay.render();
    }else {
        for (int i = 0; i < (gPanels.length); i++) {
            gPanels[i].repaint();
        }
    }
}