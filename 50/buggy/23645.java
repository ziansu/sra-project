protected final boolean onApply(core.Fighter newOwner) {
    if (!(applyCondition.test(owner)))
        return false;
    
    this.owner = newOwner;
    for (core.StatusHandler handler : listeners) {
        handler.onStatusApplication(this);
    }
    return true;
}