public void receivePlayerMovementMessage(float strafe, float forward, boolean jump) {
    playerforward = forward;
    playerstrafe = strafe;
    playerjump = jump;
    playermovement = new com.yyon.grapplinghook.vec(strafe, 0, forward);
    playermovement = playermovement.rotate_yaw(((float) ((this.entity.rotationYaw) * ((-(java.lang.Math.PI)) / 180.0))));
}