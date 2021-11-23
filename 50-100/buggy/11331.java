public void setColor(java.awt.Color color) {
    if (((this.color) != null) && (this.color.equals(color)))
        return ;
    
    this.color = color;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "color"));
}