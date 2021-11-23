public void unEquip() {
    LoadMap.getInstance().getMap(GameComponent.getCurrentMapNumber()).removeBody(body);
    LoadMap.getInstance().getMap(GameComponent.getCurrentMapNumber()).removeDrawAndUpdateObject(this);
    body = null;
    equipped = false;
}