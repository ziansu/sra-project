@java.lang.Override
public void paralelupdate(org.newdawn.slick.GameContainer container, int delta, com.valarion.gameengine.core.tiled.SubTiledMap map) throws org.newdawn.slick.SlickException {
    elapsed += delta;
    com.valarion.gameengine.events.rpgmaker.FlowEventInterface event = getEvent();
    if (event instanceof com.valarion.gameengine.events.rpgmaker.GameEvent) {
        ((com.valarion.gameengine.events.rpgmaker.GameEvent) (event)).getActive().setRendersprite(((((elapsed) % (period)) % 2) == 0));
    }
}