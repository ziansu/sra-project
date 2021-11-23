private static int calculateVerticalBoxSection(org.daanda97.games.sudoku.model.fieldattributes.FieldPosition fieldPosition) {
    int fieldNumber = fieldPosition.getFieldNumber();
    int verticalBoxSecion = ((int) (fieldNumber / 27)) + 1;
    return verticalBoxSecion;
}