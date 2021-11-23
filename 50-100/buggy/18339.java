@java.lang.Override
public void doMove() {
    java.lang.System.out.println("Attempting to execute remove move");
    if (this.isValid()) {
        java.lang.System.out.println("Move is valid");
        level.getSelectedSlots().get(0).setTile(null);
        level.repopulateSlots();
        level.setRemoveMoveSelected(false);
    }else
        java.lang.System.out.println("Move is not valid");
    
    level.getSelectedSlots().clear();
}