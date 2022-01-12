private void nextDirection() {
    switch (direction) {
        case 0 :
            xDir = 1;
            zDir = 1;
            break;
        case 1 :
            xDir = -1;
            zDir = 1;
            break;
        case 2 :
            xDir = -1;
            zDir = -1;
            break;
        case 3 :
            xDir = 1;
            zDir = -1;
            break;
    }
    (direction)++;
    if ((direction) > 3)
        direction = 0;
    
}