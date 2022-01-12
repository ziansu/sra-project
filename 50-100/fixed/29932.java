public boolean collides(game.character.Character character) {
    if (character.equals(this)) {
        return false;
    }else {
    }
    java.awt.geom.Area intersectArea = new java.awt.geom.Area(getTransformedArea());
    java.awt.geom.Area b = character.getTransformedArea();
    intersectArea.intersect(b);
    return !(intersectArea.isEmpty());
}