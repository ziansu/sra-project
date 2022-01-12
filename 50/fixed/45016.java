@java.lang.Override
public boolean canFireCondition(net.demilich.metastone.game.events.GameEvent event) {
    if ((expirationTrigger) != null) {
        return expirationTrigger.canFireCondition(event);
    }
    return true;
}