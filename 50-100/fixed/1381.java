public hrytsak.xo.model.Figure currentMove(final hrytsak.xo.model.Field field) {
    int countFigure = 0;
    for (int x = 0; x < (field.getSize()); x++) {
        countFigure += countFiguresInTheRow(field, x);
    }
    if (countFigure == ((field.getSize()) * (field.getSize())))
        return null;
    
    if ((countFigure % 2) == 0)
        return hrytsak.xo.model.Figure.X;
    
    return hrytsak.xo.model.Figure.O;
}