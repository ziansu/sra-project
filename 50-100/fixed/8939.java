@java.lang.Override
public void preUpdate() {
    super.preUpdate();
    if (this.isMoving) {
        java.util.ArrayList<android.graphics.Rect> spriteSequence = dirSpriteMap.get(curDirection);
        curSpriteIndex = ((curSpriteIndex) + 1) % (spriteSequence.size());
        com.example.vincentzhang.Sprite.Vector2D newPos = this.getSpritePos().applyDir(this.getCurDirection(), this.getMoveSpeed());
        this.setSpritePos(newPos);
        com.example.vincentzhang.Sprite.CollideDetector.setDirtyFlag(true);
    }
}