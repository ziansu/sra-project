public void draw(view.renderer.MountainsTile mountainsTile) {
    this.riverImg = determineCorrectRiverImage(mountainsTile.getNodeRepresentationRiverString(), mountainsTile.getNodeRepresentationRotation());
    boardPanel.drawTile(model.utilities.ConversionUtilities.convertFromCubeToPoint(mountainsTile.getLocation()), assetLoader.getImage("TILE_MOUNTAIN"), riverImg);
}