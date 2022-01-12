public void endNoChildren() {
    if (!(valid))
        return ;
    
    onEnd();
    parent(null);
    valid = false;
    if ((uniqueModel) != null)
        uniqueModel.dispose();
    
    scene.remove(this);
    for (com.nilunder.bdx.GameObject g : touchingObjects)
        g.activate();
    
}