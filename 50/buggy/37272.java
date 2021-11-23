public void setBitmask(boolean bitmask) {
    if ((this.bitmask) == bitmask)
        return ;
    
    this.bitmask = bitmask;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "bitmask"));
}