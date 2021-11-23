protected void move(int x) {
    moving = true;
    moveLocation = x;
    if (x < (this.getx())) {
        facingRight = false;
        left = true;
        right = false;
    }else
        if (x > (this.getx())) {
            facingRight = true;
            left = false;
            right = true;
        }
    
}