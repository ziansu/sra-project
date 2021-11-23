@be.kuleuven.cs.som.annotate.Basic
@be.kuleuven.cs.som.annotate.Raw
public void setYPosition(double yPos) throws java.lang.IllegalArgumentException {
    if (!(isValidPosition(this.getXPosition(), yPos)))
        throw new java.lang.IllegalArgumentException();
    
    this.position = new asteroids.model.Vector2D(this.getXPosition(), yPos);
}