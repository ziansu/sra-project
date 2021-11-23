@java.lang.Override
public void delete() {
    nation.units.remove(this);
    tile.settlers.remove(this);
    utils.game.countdownTasks.remove(cityBuilder);
}