private boolean isFieldWithinBoard(int x, int y, de.hsbremen.battleshipextreme.model.Board boardShotAt) {
    return (((x < (boardShotAt.getSize())) && (y < (boardShotAt.getSize()))) && (x >= 0)) && (y >= 0);
}