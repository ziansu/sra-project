public void update(com.bladecoder.engine.model.AtlasRenderer a, float delta) {
    update(delta);
    if ((!(isComplete())) && ((getPercent()) < 1.0F))
        a.setFrame(((int) ((getPercent()) * (a.getNumFrames()))));
    
}