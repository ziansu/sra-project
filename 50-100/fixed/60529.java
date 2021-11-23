public void checkExceed() {
    if ((direction) < 0) {
        if (((currentIndex) + (direction)) < (indexToGo)) {
            direction = (currentIndex) - (indexToGo);
        }
    }else
        if ((direction) > 0) {
            if (((currentIndex) + (direction)) > (indexToGo)) {
                direction = (indexToGo) - (currentIndex);
            }
        }
    
}