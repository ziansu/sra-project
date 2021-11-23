private boolean isInTheAir(game.Personnage pers) {
    for (com.badlogic.gdx.math.Polygon p : pers.getCollisions()) {
        float x = pers.getX();
        if ((x > (p.getX())) && (x < ((p.getX()) + 256))) {
            return false;
        }
    }
    return true;
}