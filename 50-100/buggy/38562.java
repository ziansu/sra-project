public void unEquip() {
    java.lang.System.out.println("in unequip");
    LoadMap.getInstance().getMap(GameComponent.getCurrentMapNumber()).removeBody(body);
    LoadMap.getInstance().getMap(GameComponent.getCurrentMapNumber()).removeDrawAndUpdateObject(this);
    body = null;
    equipped = false;
}