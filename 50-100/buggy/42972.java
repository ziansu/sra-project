@java.lang.Override
public boolean isCompatible(java.lang.Class<? extends net.sf.openrocket.rocketcomponent.RocketComponent> type) {
    if (net.sf.openrocket.rocketcomponent.BoosterSet.class.isAssignableFrom(type)) {
        return true;
    }else
        if (net.sf.openrocket.rocketcomponent.PodSet.class.isAssignableFrom(type)) {
            return true;
        }else
            if (net.sf.openrocket.rocketcomponent.AxialStage.class.isAssignableFrom(type)) {
                return true;
            }
        
    
    return net.sf.openrocket.rocketcomponent.BodyComponent.class.isAssignableFrom(type);
}