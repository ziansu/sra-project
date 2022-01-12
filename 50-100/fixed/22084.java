public void intelligence() {
    accelerate(((player.getPose().x) - (getPose().x)), ((player.getPose().y) - (getPose().y)));
    move();
}