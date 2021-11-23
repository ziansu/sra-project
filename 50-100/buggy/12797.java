public java.lang.Boolean draw(dk.eax.Field field) {
    if ((field.getToken()) == null) {
        int y = field.getCoordinate_y();
        int x = field.getCoordinate_x();
        dk.eax.graphics.Ellipse ellipsis = new dk.eax.graphics.Ellipse(x, y, 200, 200);
        ellipsis.draw();
        field.setToken(this);
        return true;
    }
    return false;
}