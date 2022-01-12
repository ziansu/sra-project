public boolean draw(nostalgia.graphics.Painter painter, boolean forced) {
    if (forced) {
        painter.drawBitmap(cursor, 0, 0);
        return true;
    }else
        return false;
    
}