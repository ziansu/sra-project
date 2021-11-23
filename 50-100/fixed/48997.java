@java.lang.Override
public void update() {
    if ((Blockbuster.proxy.config.debug_playback_ticks) && (!(this.actors.isEmpty()))) {
        mchorse.blockbuster.common.entity.EntityActor actor = this.actors.values().iterator().next();
        if ((actor.playback) != null) {
            Blockbuster.LOGGER.info(("Director tick: " + (actor.playback.tick)));
        }
    }
    super.update();
}