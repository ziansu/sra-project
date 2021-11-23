@org.junit.Before
public void initilize() {
    try {
        fieldPosition1 = new org.daanda97.games.sudoku.model.fieldattributes.FieldPosition(new org.daanda97.games.sudoku.model.fieldattributes.RowNumber(4), new org.daanda97.games.sudoku.model.fieldattributes.ColumnNumber(3));
        fieldPosition2 = new org.daanda97.games.sudoku.model.fieldattributes.FieldPosition(new org.daanda97.games.sudoku.model.fieldattributes.RowNumber(9), new org.daanda97.games.sudoku.model.fieldattributes.ColumnNumber(6));
        fieldPosition3 = new org.daanda97.games.sudoku.model.fieldattributes.FieldPosition(new org.daanda97.games.sudoku.model.fieldattributes.RowNumber(7), new org.daanda97.games.sudoku.model.fieldattributes.ColumnNumber(7));
    } catch (org.daanda97.games.sudoku.exceptions.InvalidNumber e) {
        e.printStackTrace();
    }
}