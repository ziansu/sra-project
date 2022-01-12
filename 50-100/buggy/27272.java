@java.lang.Override
public void run() {
    if ((chessGame) != null) {
        try {
            synchronized(chessGame) {
                serverChessGameDAO.deleteEntity(chessGame);
                chessGame.destroy();
            }
        } catch (org.amc.DAOException de) {
            org.amc.game.chessserver.observers.GameFinishedListener.logger.error(de);
        }
        org.amc.game.chessserver.observers.GameFinishedListener.logger.debug(java.lang.String.format("Game(%d) has been removed from database", chessGame.getUid()));
    }else {
        org.amc.game.chessserver.observers.GameFinishedListener.logger.debug("GameFinishedLisnter:ServerChessGame is null, ignoring");
    }
}