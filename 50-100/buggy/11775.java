public boolean checkIfDone(double x, double y) {
    if ((((((destX) + (error)) >= x) || (((destX) - (error)) <= x)) || (((destY) + (error)) >= y)) || (((destY) - (error)) <= y)) {
        return true;
    }else
        return false;
    
}