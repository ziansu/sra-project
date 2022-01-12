public void setPickingDeactivated(boolean pickingDeactivated) {
    if ((pickingDeactivated != (this.pickingDeactivated)) && ((mode) == (Mode.PICKING))) {
        if (pickingDeactivated) {
            remove(pickingPlugin);
        }else {
            add(pickingPlugin);
        }
        this.pickingDeactivated = pickingDeactivated;
    }
}