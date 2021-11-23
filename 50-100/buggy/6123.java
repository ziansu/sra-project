@java.lang.Override
public void onGameEvent(net.demilich.metastone.game.events.GameEvent event) {
    net.demilich.metastone.game.entities.Entity host = event.getGameContext().resolveSingleTarget(getHostReference());
    if ((((expirationTrigger) != null) && ((expirationTrigger.interestedIn()) == (event.getEventType()))) && (expirationTrigger.fires(event, host))) {
        expire();
    }
}