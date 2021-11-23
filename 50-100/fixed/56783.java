@java.lang.Override
public void apply(models.Game game) {
    game.getBoard()[piece.getCurrentRow()][piece.getCurrentColumn()] = null;
    game.getBoard()[toRow][toColumn] = piece;
    piece.setCurrentRow(toRow);
    piece.setCurrentColumn(toColumn);
}