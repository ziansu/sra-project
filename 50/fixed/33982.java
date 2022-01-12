public model.Figure getFigure(final model.Point point) throws model.exceptions.InvalidPointException {
    if (!(checkPoint(point))) {
        throw new model.exceptions.InvalidPointException();
    }
    return field[point.getX()][point.getY()];
}