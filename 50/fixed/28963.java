@java.lang.Override
public void start(com.bitdecay.game.room.AbstractRoom room) {
    super.start(room);
    room.getGameObjects().add(com.bitdecay.game.gameobject.MyGameObjectFromConf.objectFromConf(gameObjectNameToSpawn, x, y));
}