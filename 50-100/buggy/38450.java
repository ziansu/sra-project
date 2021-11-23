public void setDescription(java.lang.String description) {
    if (description == null)
        setDescription("");
    
    if (description.equals(this.description))
        return ;
    
    this.description = description;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "description"));
}