public void equip() {
    LoadMap.getInstance().getMap(GameComponent.getCurrentMapNumber()).addDrawAndUpdateObject(this);
    LoadMap.getInstance().getMap(GameComponent.getCurrentMapNumber()).addCollisionListener(this);
    super.createBody(world);
    equipped = true;
}