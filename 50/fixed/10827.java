public void refreshSlot() {
    for (java.awt.Point p : _emptySlot) {
        if (checkPlacement(p.x, p.y, code.Game.currentTile)) {
            code.Game._legalSlot.add(p);
        }
    }
}