@java.lang.Override
public synchronized boolean shootAt(iitema.gypsypokemon.model.Color color, iitema.gypsypokemon.model.Direction dir) {
    if (this.solid(dir)) {
        return true;
    }
    return false;
}