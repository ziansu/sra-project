public void update(float delta) {
    if (dragged) {
        this.bufferVect = speed.cpy().scl(delta);
        this.position.add(bufferVect);
        this.boundView();
        if (zoomLock)
            lockCountDown -= delta;
        
        if ((lockCountDown) < 0.0F)
            zoomLock = false;
        
    }
    super.update();
}