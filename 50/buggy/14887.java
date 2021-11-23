@java.lang.Override
public void sellPproperty(entity.Player player) {
    player.updateNumTerritoryOwned((-1));
}