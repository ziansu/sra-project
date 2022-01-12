public static boolean checkCollision(worldObjects.WorldObject w) {
    for (worldObjects.WorldObject obj : controller.WorldController.getWorld().getObjects()) {
        if (!(obj.equals(w))) {
            return controller.CollisionChecker.overlap(w, obj);
        }
    }
    return false;
}