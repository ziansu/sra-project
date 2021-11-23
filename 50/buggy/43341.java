private void jumpPlayer() {
    if (canJump) {
        playerVelocity = playerVelocity.add(0, (-30));
        java.lang.System.out.println(player.getTranslateY());
        canJump = false;
    }
}