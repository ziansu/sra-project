public boolean setColor(java.awt.Color color) {
    if ((((this.color) != null) && (this.color.equals(color))) || (((this.color) == null) && (color == null)))
        return false;
    
    this.color = color;
    fireFieldChanged(new ru.foxling.graphit.config.FieldEvent(this, FieldEvent.UPDATE, "color"));
    return true;
}