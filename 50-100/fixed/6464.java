private static boolean isValidMouseMove(CatAndMouseWithLake.Direction direction, java.awt.Point mouse, java.awt.Point cat, int boardSize) {
    java.awt.Point simulatedMouseMove = new java.awt.Point(mouse);
    simulatedMouseMove = CatAndMouseWithLake.translatePointWithDirection(simulatedMouseMove, direction);
    return ((!(cat.equals(simulatedMouseMove))) && (!(CatAndMouseWithLake.isInsideLake(simulatedMouseMove)))) && (CatAndMouseWithLake.isInsideBoard(simulatedMouseMove, boardSize));
}