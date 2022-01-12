private void scaleWallsY(float multiplier) {
    com.badlogic.gdx.math.collision.BoundingBox bounds = new com.badlogic.gdx.math.collision.BoundingBox();
    backWall.calculateBoundingBox(bounds).mul(backWall.transform);
    if ((multiplier > 0) || ((bounds.getHeight()) > (com.ggwp.interiordesigner.object.Room.MINIMUM_DIMENSION))) {
        float scalePercentage = 1.0F + (((com.ggwp.interiordesigner.object.Room.SCALE_AMOUNT) / (bounds.getHeight())) * multiplier);
        for (com.ggwp.interiordesigner.object.Wall wall : getWalls()) {
            wall.transform.scale(1.0F, scalePercentage, 1.0F);
        }
    }
}