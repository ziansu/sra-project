public int makeTurn() {
    if ((round) < 5) {
        return 3;
    }
    wildfour.PlayField field = wildfour.PlayField.fromBotField(this.field, myId);
    return moveFinder.findBestMove(field, 0).move;
}