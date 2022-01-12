public void intelligence() {
    accelerate(((player.getPose().x) - (getPose().x)), ((player.getPose().y) - (getPose().y)));
    java.lang.System.out.println((((xVelocity) + " ") + (yVelocity)));
    move();
}