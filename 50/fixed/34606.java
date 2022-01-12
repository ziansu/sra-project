@java.lang.Override
public void onEquipletCommandStatusChanged(HAL.EquipletCommandStatus status) {
    synchronized(this) {
        this.forwardTarget.onEquipletCommandStatusChanged(status);
        this.forwardTarget = null;
    }
}