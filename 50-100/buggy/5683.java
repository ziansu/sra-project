protected void checkCollisionConnection(java.lang.Object object, int x, int y) {
    if (object instanceof hcm.ssj.core.Sensor) {
        addCollisionConnection(object, x, y, componentViewsProvider, false);
    }else
        if (object instanceof hcm.ssj.core.Provider) {
            boolean found = addCollisionConnection(object, x, y, componentViewsTransformer, true);
            if (!found) {
                addCollisionConnection(object, x, y, componentViewsConsumer, true);
            }
        }
    
}