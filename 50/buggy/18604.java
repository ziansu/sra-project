@java.lang.Override
public boolean stepOn(iitema.gypsypokemon.elements.Direction dir, iitema.gypsypokemon.elements.blocks.PlayerInterface player) {
    if (super.stepOn(iitema.gypsypokemon.elements.Direction, iitema.gypsypokemon.elements.blocks.PlayerInterface)) {
        this.door.open();
        return true;
    }
    return false;
}