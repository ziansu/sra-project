public boolean verifyPcbGamePatch(com.toyfactory.pcb.model.PcbGame pcbGame) {
    com.toyfactory.pcb.domain.Game game = gameService.findGame(pcbGame.getGsn());
    if (!(game.getMajor().equals(pcbGame.getMajor()))) {
        return false;
    }
    return true;
}