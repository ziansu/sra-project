private void collisionAnalyse() {
    for (GameObject object : handler.getAllObjects()) {
        if (object instanceof Enemy) {
            if (this.getBounds().intersects(object.getBounds())) {
                handler.removeObject(object);
            }
        }
    }
}