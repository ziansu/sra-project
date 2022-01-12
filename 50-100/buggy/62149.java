private void readColorsFromTheNifty() {
    de.lessvoid.nifty.elements.Element pausePanel = nifty.getCurrentScreen().findElementById("pause_panel");
    pausePanelColor = pausePanel.getRenderer(de.lessvoid.nifty.elements.render.PanelRenderer.class).getBackgroundColor();
    de.lessvoid.nifty.elements.Element pause = nifty.getCurrentScreen().findElementById("pause");
    pauseTextColor = pause.getRenderer(de.lessvoid.nifty.elements.render.TextRenderer.class).getColor();
}