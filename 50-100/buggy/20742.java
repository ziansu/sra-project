public static com.rpsg.rpg.object.base.Persistence read() {
    java.lang.Object o = com.rpsg.rpg.io.Files.load(com.rpsg.rpg.object.base.Persistence.PersistenceFileName);
    java.io.File file = Gdx.files.local(com.rpsg.rpg.object.base.Persistence.PersistenceFileName).file();
    if (null != o)
        return ((com.rpsg.rpg.object.base.Persistence) (o));
    
    Gdx.files.local(Setting.GAME_PERSISTENCE).mkdirs();
    com.rpsg.rpg.object.base.Persistence p = new com.rpsg.rpg.object.base.Persistence();
    p.touchMod = !(com.rpsg.rpg.utils.game.GameUtil.isDesktop);
    com.rpsg.rpg.io.Files.save(p, com.rpsg.rpg.object.base.Persistence.PersistenceFileName);
    return p;
}