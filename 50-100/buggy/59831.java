public void setName(java.lang.String name) throws java.lang.IllegalArgumentException {
    if ((name == null) || (name.equals("")))
        throw new java.lang.IllegalArgumentException("Имя не должно быть пустым");
    
    if (name.equals(this.name))
        return ;
    
    this.name = name;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "name"));
}