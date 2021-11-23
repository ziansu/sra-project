private void updateGroundPositions(com.jirge.shared.UpdateBoardInfo info) {
    com.google.gwt.dom.client.ImageElement element = ((info.playerType) == (com.jirge.shared.PieceType.DOG)) ? elementDog : elementDeer;
    if ((info.beforePos) == 36) {
        gameBoard.animateIn(info.afterPos, context, element);
    }else {
        if ((info.beforePos) != 0) {
            gameBoard.animateOut(info.beforePos, context);
        }
        if ((info.afterPos) != 0) {
            gameBoard.animateIn(info.afterPos, context, element);
        }
    }
}