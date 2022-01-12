@java.lang.Override
public com.example.vincentzhang.Sprite.AbstractSprite detectCollide(com.example.vincentzhang.Sprite.ImageSprite imgSprite) {
    for (com.example.vincentzhang.Sprite.AbstractCollidableSprite bomb : bombs) {
        if (bomb.detectCollide(imgSprite))
            return bomb;
        
    }
    for (com.example.vincentzhang.Sprite.AbstractCollidableSprite explosion : explosions) {
        if (explosion.detectCollide(imgSprite))
            return explosion;
        
    }
    return null;
}