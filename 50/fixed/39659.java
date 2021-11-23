private void nextBeltPush() {
    tk.blacky704.bgcraft.tileentity.TileEntityBelt nextBelt = getNextBelt();
    if (nextBelt != null) {
        nextBelt.moveExcludingEntities();
        nextBelt.nextBeltPush();
    }
}