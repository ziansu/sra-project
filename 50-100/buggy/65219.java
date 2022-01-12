public boolean detectCollide(com.example.vincentzhang.Sprite.AbstractSprite target) {
    if (!(com.example.vincentzhang.Sprite.Utilities.detectCollide(target.mScrRect, this.mScrRect))) {
        return false;
    }
    com.example.vincentzhang.Sprite.CollideDetector collideDetector = new com.example.vincentzhang.Sprite.CollideDetector(this, target);
    if (!(collideDetector.detect())) {
        return false;
    }
    target.onCollide(this);
    this.onCollide(target);
    return true;
}