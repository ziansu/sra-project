protected void move(int x) {
    moving = true;
    moveLocation = x;
    if ((moveLocation) < (this.getx())) {
        facingRight = false;
        left = true;
        right = false;
    }else
        if ((moveLocation) > (this.getx())) {
            facingRight = true;
            left = false;
            right = true;
        }
    
}