private void checkIfDone() {
    if ((s.getCurrentPropertyCount()) < (com.byteme.Controllers.LandGrantHandler.MAX_PROPERTIES)) {
        s.incrPlayer();
        getBoardController().setPlayer(s.getCurrentPlayer());
    }else {
        getBoardController().updateState(MapControllerStates.LAND_PURCHASE);
    }
}