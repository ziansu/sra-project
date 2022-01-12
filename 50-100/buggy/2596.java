public void handleCollisionWithObject(pl.miczeq.objects.AbstractGameObject obj) {
    if (this.isObjectIsInRoom(obj)) {
        for (pl.miczeq.objects.Wall wall : walls) {
            pl.miczeq.objects.AbstractGameObject.handleCollisionBetweenTwoObjects(obj, wall);
        }
        for (pl.miczeq.objects.Door door : doors) {
            if ((door.isClosed()) && (!(roomCleaned))) {
                pl.miczeq.objects.AbstractGameObject.handleCollisionBetweenTwoObjects(obj, door);
            }
        }
    }
}