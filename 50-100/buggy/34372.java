public org.thiki.kanban.board.Board create(java.lang.String userName, final org.thiki.kanban.board.Board board) {
    boolean isExists = boardsPersistence.unique(board.getName(), userName);
    if (isExists) {
        throw new org.thiki.kanban.foundation.exception.BusinessException(BoardCodes.BOARD_IS_ALREADY_EXISTS);
    }
    board.setAuthor(userName);
    boardsPersistence.create(board);
    return boardsPersistence.findById(board.getId());
}