protected void draw(android.graphics.Canvas canvas) {
    if ((center) == null) {
        return ;
    }
    switch (style) {
        case RECTANGLE :
            break;
        case CIRCLE :
            canvas.drawCircle(center.x, center.y, radius, paint);
            break;
    }
}