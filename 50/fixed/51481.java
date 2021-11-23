public boolean setOptional(boolean optional) {
    if (optional == (this.optional))
        return false;
    
    this.optional = optional;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "optional"));
    return true;
}