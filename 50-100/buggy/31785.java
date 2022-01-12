public void update(com.bladecoder.engine.model.AtlasRenderer a, float delta) {
    update(delta);
    if (!(isComplete()))
        a.setFrame(((int) ((getPercent()) * (a.getNumFrames()))));
    
}