private void setCoordinate() {
    switch (direction) {
        case UP :
            --(yAxis);
            break;
        case DOWN :
            ++(yAxis);
            break;
        case RIGHT :
            ++(xAxis);
            break;
        case LEFT :
            --(xAxis);
            break;
        default :
            break;
    }
}