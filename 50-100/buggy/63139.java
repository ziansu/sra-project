public void endNoChildren() {
    onEnd();
    parent(null);
    valid = false;
    if ((uniqueModel) != null)
        uniqueModel.dispose();
    
    scene.remove(this);
    for (com.nilunder.bdx.GameObject g : touchingObjects)
        g.activate();
    
}