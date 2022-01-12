public boolean setBitmask(boolean bitmask) {
    if ((this.bitmask) == bitmask)
        return false;
    
    this.bitmask = bitmask;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "bitmask"));
    return true;
}