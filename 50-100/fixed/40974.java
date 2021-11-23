public boolean isEmpty(double x, double y) {
    if ((((int) (x / (gridSize))) > (width)) || (((int) (y / (gridSize))) > (height))) {
        return false;
    }else {
        return mask[((int) (x / (gridSize)))][((int) (y / (gridSize)))];
    }
}