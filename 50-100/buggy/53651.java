@org.junit.Test
public void isTakenJumpLeftTest() {
    currentPieces.getPiece(10).setColumn(3);
    currentPieces.getPiece(10).setRow(4);
    changedPieces3.getPiece(14).setRow(3);
    changedPieces3.getPiece(14).setColumn(2);
    assertTrue(logic.takenJumpLeft(currentPieces, changedPieces3));
}