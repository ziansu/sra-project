public boolean interact(gameElements.Replicator player, enums.Direction dir) {
    if (((getBoxListWeight()) + 1) >= (openWeight)) {
        door.open();
    }
    return true;
}