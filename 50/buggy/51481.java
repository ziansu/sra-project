public void setOptional(boolean optional) {
    if (optional == (this.optional))
        return ;
    
    this.optional = optional;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "optional"));
}