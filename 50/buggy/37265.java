@java.lang.Override
public synchronized boolean stepOn(iitema.gypsypokemon.model.Direction dir, iitema.gypsypokemon.model.PlayerInterface player) {
    for (iitema.gypsypokemon.model.ItemInterface item : items) {
        if (item.solid(dir)) {
            return false;
        }
    }
    player.move(this);
    return true;
}