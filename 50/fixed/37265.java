@java.lang.Override
public synchronized boolean stepOn(iitema.gypsypokemon.model.Direction dir, iitema.gypsypokemon.model.PlayerInterface player) {
    if (this.solid(dir)) {
        return false;
    }
    player.move(this);
    return true;
}