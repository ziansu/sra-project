public hrytsak.xo.model.Figure currentMove(final hrytsak.xo.model.Field field) {
    int countFigure = 0;
    for (int y = 0; y < (field.getSize()); y++) {
        countFigure += countFiguresInTheRow(field, y);
    }
    if (countFigure == ((field.getSize()) * (field.getSize()))) {
        return null;
    }
    if ((countFigure % 2) == 0) {
        return hrytsak.xo.model.Figure.X;
    }
    return hrytsak.xo.model.Figure.O;
}