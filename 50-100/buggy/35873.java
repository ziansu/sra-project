public void setRole(ru.foxling.graphit.config.FieldRole role) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
    if (role == null)
        throw new java.lang.IllegalArgumentException("Состояние не может быть NULL");
    
    if ((this.role) == role)
        return ;
    
    this.role = role;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "role"));
}