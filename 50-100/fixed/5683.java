protected boolean checkCollisionConnection(java.lang.Object object, int x, int y) {
    boolean result = false;
    if (object instanceof hcm.ssj.core.Sensor) {
        result = addCollisionConnection(object, x, y, componentViewsProvider, false);
    }else
        if (object instanceof hcm.ssj.core.Provider) {
            boolean found = addCollisionConnection(object, x, y, componentViewsTransformer, true);
            result = found;
            if (!found) {
                result = addCollisionConnection(object, x, y, componentViewsConsumer, true);
            }
        }
    
    return result;
}