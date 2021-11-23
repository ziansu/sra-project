private void collisionAnalyse() {
    for (GameObject object : handler.getAllObjects()) {
        if (object instanceof Enemy) {
            if (this.getBounds().intersects(object.getBounds())) {
                java.lang.System.out.println("Killing Enemy!!");
                handler.removeObject(object);
            }
        }
    }
}