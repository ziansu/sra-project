public void undock() {
    restore();
    if ((getParentContainer()) != null) {
        getParentContainer().undock(this);
        station.remove(this);
    }else
        if (floatingProperty.get()) {
            closeFloatingStage();
            station.remove(this);
        }
    
}