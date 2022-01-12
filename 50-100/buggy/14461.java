public void reset() {
    this.entityManager = new net.watc4.game.entity.EntityManager();
    this.map = new net.watc4.game.map.Map("res/maps/map2.txt");
    this.entityLumi = new net.watc4.game.entity.EntityLumi(this.map.lumiSpawnX, this.map.lumiSpawnY, this);
    this.entityPattou = new net.watc4.game.entity.EntityPattou(this.map.pattouSpawnX, this.map.pattouSpawnY, this);
    this.map.lightManager.update();
}