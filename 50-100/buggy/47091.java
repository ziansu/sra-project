public void update() {
    if (m2035690.tees.ac.uk.theendlessrunner.GamePanel.player.getPlaying()) {
        m2035690.tees.ac.uk.theendlessrunner.GamePanel.player.update();
        if (m2035690.tees.ac.uk.theendlessrunner.GamePanel.player.getAlive()) {
            m2035690.tees.ac.uk.theendlessrunner.GamePanel.camera.setCamera(((m2035690.tees.ac.uk.theendlessrunner.GamePanel.player.getX()) - (m2035690.tees.ac.uk.theendlessrunner.GamePanel.camera_offset.x)), ((m2035690.tees.ac.uk.theendlessrunner.GamePanel.player.getY()) - (m2035690.tees.ac.uk.theendlessrunner.GamePanel.camera_offset.y)), ((int) (m2035690.tees.ac.uk.theendlessrunner.GamePanel.WIDTH)), ((int) (m2035690.tees.ac.uk.theendlessrunner.GamePanel.HEIGHT)));
            checkCollisions();
        }
    }
}