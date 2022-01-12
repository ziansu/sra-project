public void putObject(tk.ubublik.redivansion.gamelogic.units.objects.WorldObject worldObject) {
    com.jme3.math.Vector3f position = mapPointToWorld(worldObject.getPosition());
    worldObject.setLocalTranslation(position);
    node.attachChild(worldObject);
}