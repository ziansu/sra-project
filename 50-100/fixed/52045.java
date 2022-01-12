private void checkIfDone() {
    s.incrPlayer();
    if ((s.getCurrentPropertyCount()) < (com.byteme.Controllers.LandGrantHandler.MAX_PROPERTIES)) {
        getBoardController().setPlayer(s.getCurrentPlayer());
    }else {
        getBoardController().updateState(MapControllerStates.LAND_PURCHASE);
    }
}