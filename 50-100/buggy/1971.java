public void undock() {
    restore();
    if (((getParentContainer()) != null) && (!((getParentContainer()) instanceof com.anchorage.docks.containers.SingleDockContainer))) {
        getParentContainer().undock(this);
        station.remove(this);
    }else
        if (floatingProperty.get()) {
            closeFloatingStage();
            station.remove(this);
        }
    
}