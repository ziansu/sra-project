public zeroPlayerGamePackage.PositionObject generateRandomLocation() {
    int positionX = ((int) (java.lang.Math.round((((zeroPlayerGamePackage.BoardBuilder.BOARD_WIDTH) + 1) * (java.lang.Math.random())))));
    int positionY = ((int) (java.lang.Math.round((((zeroPlayerGamePackage.BoardBuilder.BOARD_HEIGHT) + 1) * (java.lang.Math.random())))));
    zeroPlayerGamePackage.PositionObject position = new zeroPlayerGamePackage.PositionObject(positionX, positionY);
    return position;
}