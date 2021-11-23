public void DoDraw(android.graphics.Canvas c) {
    if (c == null)
        return ;
    
    c.save();
    listener.drawing(c);
    c.restore();
}