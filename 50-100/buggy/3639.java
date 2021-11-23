public void renderImage(java.lang.String imgName, float x, float y, float w, float h, float rot, boolean useCamera) {
    if (useCamera)
        normalRenderQueue.add(new info.quadtree.rv.graphics.SGF.QueuedImage(x, y, w, h, rot, imgName));
    else
        uiRenderQueue.add(new info.quadtree.rv.graphics.SGF.QueuedImage(x, ((Gdx.graphics.getHeight()) - y), w, h, rot, imgName));
    
}