private int positionToCell(final pacmandemo.world.Position pos) {
    return ((pos.getColumn()) * 3) + (pos.getRow());
}