public void cannotMoveOnTopOfOther() throws java.sql.SQLException {
    createTestValues();
    moveDefined(moveStepSize, moveStepSize, moveStepSize);
    int tmpID = shipID;
    shipID = -1;
    java.sql.PreparedStatement ps = conn.prepareStatement(createTmpShip);
    ps.setInt(1, shipID);
    ps.execute();
    noShipsInSamePos();
    ps = conn.prepareStatement(deleteTmpShip);
    ps.setInt(1, shipID);
    ps.execute();
    shipID = tmpID;
    removeTestValues();
}