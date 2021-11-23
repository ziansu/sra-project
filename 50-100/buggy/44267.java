@java.lang.Override
protected synchronized boolean solid(iitema.gypsypokemon.model.Direction dir) {
    if (this.openSides.get(dir)) {
        for (iitema.gypsypokemon.model.ItemInterface item : items) {
            if (item.solid(dir)) {
                return true;
            }
        }
        return false;
    }
    return false;
}