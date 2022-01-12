public void applyFigure(final hrytsak.xo.model.Field field, final hrytsak.xo.model.Figure figure, final java.awt.Point point) throws hrytsak.xo.model.exception.AlreadyOccupiedException, hrytsak.xo.model.exception.InvalidPointException {
    if ((field.getFigure(point)) != null) {
        throw new hrytsak.xo.model.exception.AlreadyOccupiedException();
    }
    field.setFigure(point, figure);
}