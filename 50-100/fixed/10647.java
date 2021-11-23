public void update(int direction) {
    switch (direction) {
        case fr.esiea.ga.tetris.client.Model.Piece.DIR_BOTTOM :
            savePrevPosPiece();
            (xPos)++;
            break;
        case fr.esiea.ga.tetris.client.Model.Piece.DIR_RIGHT :
            savePrevPosPiece();
            (yPos)++;
            break;
        case fr.esiea.ga.tetris.client.Model.Piece.DIR_LEFT :
            savePrevPosPiece();
            (yPos)--;
            break;
        case fr.esiea.ga.tetris.client.Model.Piece.DIR_TOP :
            savePrevPosPiece();
            rotatePieceLeft();
            break;
        default :
            break;
    }
}