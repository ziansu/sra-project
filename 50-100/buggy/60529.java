public void checkExceed() {
    if ((direction) < 0) {
        if (((currentIndex) + (direction)) < (indexToGo)) {
            currentIndex = indexToGo;
        }
    }else
        if ((direction) > 0) {
            if (((currentIndex) + (direction)) > (indexToGo)) {
                currentIndex = indexToGo;
            }
        }
    
}