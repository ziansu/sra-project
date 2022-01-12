@java.lang.Override
public boolean apply(mage.game.Game game, mage.abilities.Ability source) {
    for (java.util.UUID opponentId : game.getOpponents(source.getControllerId())) {
        mage.watchers.common.PlayerDamagedBySourceWatcher watcher = ((mage.watchers.common.PlayerDamagedBySourceWatcher) (game.getState().getWatchers().get(mage.watchers.common.PlayerDamagedBySourceWatcher.class.getSimpleName(), opponentId)));
        if (watcher != null) {
            return watcher.hasSourceDoneDamage(source.getSourceId(), game);
        }
    }
    return false;
}