private void searchForResource() {
    java.awt.Point p = mouse.getMemoryModule().findNearestResource(null);
    if (p != null) {
        com.km.mouse.board.MoveType moveType = com.km.mouse.modules.GeoUtil.getFirstStep(mouse.getPosition(), p);
        mouse.move(moveType);
    }else {
        com.km.mouse.util.LogQueue.append(java.lang.String.format("%05d\tCANNOT FIND UNKNOWN\n", mouse.getTime()));
    }
}