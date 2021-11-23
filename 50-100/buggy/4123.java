@jumpingalien.model.Basic
public void setPosition(jumpingalien.model.Vector2D<java.lang.Double> position) throws java.lang.IllegalArgumentException, java.lang.NullPointerException {
    if (position == null) {
        throw new java.lang.NullPointerException("The position can not be null.");
    }else
        if (!(jumpingalien.model.GameObject.isValidPosition(position))) {
            throw new java.lang.IllegalArgumentException("The given position is not valid, see isValidPosition.");
        }
    
    this.position = position;
}