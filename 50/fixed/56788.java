public boolean putObjectCenter(tk.ubublik.redivansion.gamelogic.units.objects.WorldObject worldObject) {
    worldObject.setPosition(mapRenderer.worldPointToMap(cameraControl.getCameraCenterPoint()));
    return putObject(worldObject);
}