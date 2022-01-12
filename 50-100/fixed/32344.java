public void render() {
    if (settings.isConsoleMode()) {
        consoleDisplay.render();
    }else {
        for (int i = 0; i < (gPanels.length); i++) {
            gPanels[i].render();
        }
    }
}