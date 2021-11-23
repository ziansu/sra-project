@java.lang.Override
public void act() {
    if ((((z) <= 2) && ((steps) < (sideLength))) && (canMove())) {
        move();
        (steps)++;
    }else {
        if (!(canMove()))
            return ;
        
        steps = 0;
        (z)++;
        if ((z) == 1) {
            setDirection(Location.SOUTHWEST);
        }else
            if ((z) == 2) {
                setDirection(Location.EAST);
            }
        
    }
}