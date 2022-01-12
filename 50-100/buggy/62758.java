public boolean pickUpItem(escape.gameworld.Item i) {
    if ((items.size()) >= 5)
        return false;
    
    if (!(i.isPickable()))
        return false;
    
    if (i instanceof escape.gameworld.Container) {
        this.items.add(i);
        this.room.removeContainer(((escape.gameworld.Container) (i)));
        return true;
    }
    this.items.add(i);
    this.room.removeItem(i);
    return true;
}