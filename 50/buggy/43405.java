public void die() {
    MainClass.enemies_in_scene.remove(this);
    MainClass.enemies.remove(this);
    framework.AudioHandler.playSound("data/explodemini.wav");
}