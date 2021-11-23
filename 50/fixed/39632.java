@java.lang.Override
public boolean removeItem(iitema.gypsypokemon.elements.Direction dir) {
    if (super.removeItem(dir)) {
        this.door.close();
        return true;
    }
    return false;
}