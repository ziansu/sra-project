public void isGravityOn(java.awt.Graphics2D brush) {
    if (((Canvas.userYC) >= ((Canvas.groundYA) - 50)) || ((Canvas.userYC) >= ((Canvas.groundYB) - 50))) {
        Canvas.gravityOn = false;
    }else
        if ((((Canvas.userYC) < ((Canvas.groundYA) - 50)) || ((Canvas.userYC) < ((Canvas.groundYB) - 50))) && (!(Canvas.amOnObstacle))) {
            Canvas.gravityOn = true;
        }
    
}