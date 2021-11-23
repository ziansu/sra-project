@java.lang.Override
public boolean markHold() {
    return super.confirmHoldForType("Damage") ? this.markDamageHold() : false;
}