public static int getChangedScore(model.BoardData boardData, int col, int row) {
    model.PieceColor[][] data = boardData.getData();
    model.PieceColor pieceColor = data[col][row];
    data[col][row] = null;
    int score = -(model.Score.getScoreByPosition(data, col, row));
    data[col][row] = pieceColor;
    score += model.Score.getScoreByPosition(data, col, row);
    return score;
}