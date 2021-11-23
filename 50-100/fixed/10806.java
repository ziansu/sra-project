public static boolean checkCollision(worldObjects.WorldObject w) {
    for (worldObjects.WorldObject obj : controller.WorldController.getWorld().getObjects()) {
        if ((!(obj.equals(w))) && (controller.CollisionChecker.overlap(w, obj))) {
            return true;
        }
    }
    return false;
}