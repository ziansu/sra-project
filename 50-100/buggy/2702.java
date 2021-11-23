public void applyGravity() {
    if (!(playerCanMoveY(0))) {
        player.enteredAir(false);
    }else {
        if (playerCanMoveY(GRAVITY)) {
            player.enteredAir(true);
            player.moveVertical(GRAVITY);
        }else {
            player.enteredAir(false);
        }
    }
}