public void setupAI() {
    ai = new entity.mobs.ai.PirateAI(this);
    if ((baseTile) == null)
        baseTile = new java.awt.Point(((getX()) / 32), ((getY()) / 32));
    
    ((entity.mobs.ai.PirateAI) (ai)).wanderer.setBase(baseTile.x, baseTile.y, 15);
}