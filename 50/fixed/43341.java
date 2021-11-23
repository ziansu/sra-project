private void jumpPlayer() {
    if (canJump) {
        playerVelocity = playerVelocity.add(0, (-30));
        canJump = false;
    }
}