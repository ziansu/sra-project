public org.thiki.kanban.board.Board update(java.lang.String userName, org.thiki.kanban.board.Board board) {
    org.thiki.kanban.board.Board boardToDelete = boardsPersistence.findById(board.getId());
    if (boardToDelete == null) {
        throw new org.thiki.kanban.foundation.exception.ResourceNotFoundException(BoardCodes.BOARD_IS_NOT_EXISTS);
    }
    boolean isExists = boardsPersistence.unique(board.getName(), userName);
    if (isExists) {
        throw new org.thiki.kanban.foundation.exception.BusinessException(BoardCodes.BOARD_IS_ALREADY_EXISTS);
    }
    boardsPersistence.update(board);
    return boardsPersistence.findById(board.getId());
}