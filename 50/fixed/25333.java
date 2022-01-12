public void jump() {
    if (grinding) {
        currentTrick = null;
        inTrick = false;
        jumping = false;
        inTrickTimer = 0;
        jumpingTimer = 0;
        grinding = false;
    }
    jumping = true;
    onGround = false;
}