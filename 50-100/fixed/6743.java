void update() {
    clickModel.transform.setToTranslation(control.getClickOnMap().x, control.getClickOnMap().y, de.eightbitboy.ecorealms.Highlighter.CLICK_HEIGHT);
    hoverModel.transform.setToTranslation(control.getHoverOverMap().x, control.getHoverOverMap().y, de.eightbitboy.ecorealms.Highlighter.HOVER_HEIGHT);
}