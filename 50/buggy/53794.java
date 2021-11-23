public void remove() {
    for (com.projectkorra.projectkorra.util.TempBlock tb : tempBlocks) {
        if (tb != null) {
            tb.revertBlock();
        }
    }
    tempBlocks.clear();
    com.jedk1.jedcore.ability.waterbending.IceWall.instances.remove(this);
}