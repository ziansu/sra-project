private int colOffsetBasedOnPlayer() {
    return (kingsPosition.column()) + (this.player().equals(Player.WHITE) ? 1 : -1);
}