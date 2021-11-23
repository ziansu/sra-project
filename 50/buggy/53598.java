public void draw(com.badlogic.gdx.graphics.g2d.Batch batch) {
    if ((!(destroyed)) || ((stateTime) < 50)) {
        super.draw(batch);
    }else
        if (isSpawned) {
            this.setIsSpawned(false);
        }
    
}