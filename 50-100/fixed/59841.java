public void handleMouseRelease(int x, int y, int button) {
    mw.client.gui.ImageTile clickedTile = mapDisp.getClickedTile(x, y);
    mw.client.model.ModelTile clickedModelTile = mw.client.controller.ModelViewMapping.singleton().getModelTile(clickedTile);
    if (clickedModelTile != null) {
        clickedModelTile.setColor(SharedColor.RED);
        clickedModelTile.notifyObservers();
    }
}