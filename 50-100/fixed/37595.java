@java.lang.Override
public void setRectF(android.graphics.RectF rectF) {
    if ((spriteRectListener) != null)
        super.setRectF(spriteRectListener.calculateSpriteRect());
    else
        super.setRectF(rectF);
    
    if (((getRectF()) != null) && ((spriteRectListener) != null))
        this.center = spriteRectListener.calculateSpriteCenter();
    
}