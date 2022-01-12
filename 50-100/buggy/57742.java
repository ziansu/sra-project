public void noContact() {
    if (((Canvas.userYC) >= ((Canvas.groundYA) - 50)) || ((Canvas.userYC) >= ((Canvas.groundYB) - 50))) {
        Canvas.userYC = (Canvas.groundYA) - 50;
        Canvas.currentlyJumping = false;
    }
}