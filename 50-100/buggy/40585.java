protected float getImpulse(game.shadowlight.utils.Direction direction) {
    final float range = (this.getRange()) + (((float) (java.lang.Math.random())) * ((this.getRange()) + (this.getMaxRange())));
    switch (direction) {
        case RIGHT :
            return range;
        case LEFT :
        case UP :
        case DOWN :
        default :
            return -range;
    }
}