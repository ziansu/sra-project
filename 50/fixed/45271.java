@be.kuleuven.cs.som.annotate.Basic
@be.kuleuven.cs.som.annotate.Raw
public void setXPosition(double xPos) throws java.lang.IllegalArgumentException {
    if (!(isValidPosition(xPos, this.getYPosition())))
        throw new java.lang.IllegalArgumentException();
    
    this.position = new asteroids.model.Vector2D(xPos, this.getYPosition());
}