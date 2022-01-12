public void applyFigure(final hrytsak.xo.model.Field field, final java.awt.Point point, final hrytsak.xo.model.Figure figure) throws hrytsak.xo.model.exception.AlreadyOccupiedException, hrytsak.xo.model.exception.InvalidPointException {
    if ((field.getFigure(point)) != null) {
        throw new hrytsak.xo.model.exception.AlreadyOccupiedException();
    }
    field.setFigure(point, figure);
}