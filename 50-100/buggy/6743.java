void update() {
    clickModel.transform.setToTranslation(control.getClickOnMap().getX(), control.getClickOnMap().getY(), de.eightbitboy.ecorealms.Highlighter.CLICK_HEIGHT);
    hoverModel.transform.setToTranslation(control.getHoverOverMap().getX(), control.getHoverOverMap().getY(), de.eightbitboy.ecorealms.Highlighter.HOVER_HEIGHT);
}