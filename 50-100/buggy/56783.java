@java.lang.Override
public void apply(models.Game game) {
    java.lang.System.out.println(("applying to " + (piece)));
    int a = piece.getCurrentRow();
    int b = piece.getCurrentColumn();
    game.getBoard()[piece.getCurrentRow()][piece.getCurrentColumn()] = null;
    game.getBoard()[toRow][toColumn] = piece;
    piece.setCurrentRow(toRow);
    piece.setCurrentColumn(toColumn);
}