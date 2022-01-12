protected float getImpulse(game.shadowlight.utils.Direction direction) {
    final float range = (this.getRange()) + (((float) (java.lang.Math.random())) * ((this.getMaxRange()) - (this.getRange())));
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