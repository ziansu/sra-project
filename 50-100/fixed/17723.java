public void updateLevel(int newLevel) {
    java.lang.String levelText = java.lang.String.valueOf(newLevel);
    de.lessvoid.nifty.elements.Element levelTextElem = shipCompElem.findElementByName(stellarclicker.app.ShipComponentElementController.LEVEL_TEXT_ID);
    if (levelTextElem != null) {
        levelTextElem.getRenderer(de.lessvoid.nifty.elements.render.TextRenderer.class).setText(levelText);
    }
}