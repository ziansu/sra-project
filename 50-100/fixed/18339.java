@java.lang.Override
public void doMove() {
    if (this.isValid()) {
        level.getSelectedSlots().get(0).setTile(null);
        level.repopulateSlots();
        level.setRemoveMoveSelected(false);
    }
    level.getSelectedSlots().clear();
}