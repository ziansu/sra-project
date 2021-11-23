@be.kuleuven.cs.som.annotate.Raw
private void setPosition(hillbillies.model.Vector position) {
    if ((this.world) == null)
        throw new java.lang.ClassCastException();
    
    if (!(this.world.isPositionInWorld(position)))
        throw new java.lang.IllegalArgumentException();
    
    this.position = position;
}