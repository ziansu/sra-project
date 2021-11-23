private int getFirstEmptySlot() {
    int i = 0;
    for (org.escaperun.game.model.items.TakeableItem current : items) {
        if (current == null) {
            break;
        }
    }
    return i;
}