public void temporarilyMakeImmediatelyRelevant(final org.jtrfp.trcl.obj.PositionedRenderable pr) {
    if (pr instanceof org.jtrfp.trcl.obj.WorldObject)
        try {
            if (!(org.jtrfp.trcl.core.Renderer.NEW_MODE))
                collisionManager.getCurrentlyActiveCollisionList().add(((org.jtrfp.trcl.obj.WorldObject) (pr)));
            
        } catch (java.lang.Exception ex) {
            throw new java.lang.RuntimeException(ex);
        }
    
    if (!(org.jtrfp.trcl.core.Renderer.NEW_MODE))
        renderList.get().getVisibleWorldObjectList().add(pr);
    
}