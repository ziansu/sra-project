public void dropDownAndReverse() {
    if ((shipMoving) == (LEFT)) {
        shipMoving = RIGHT;
    }else
        if ((shipMoving) == (RIGHT)) {
            shipMoving = LEFT;
        }
    
    y = (y) + (height);
    shipSpeed = (shipSpeed) * 0.5F;
}