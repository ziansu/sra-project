public boolean isCompleteAnimate() {
    if ((direction) > 0) {
        if ((currentIndex) >= (indexToGo)) {
            return true;
        }
    }else
        if ((direction) < 0) {
            if ((currentIndex) <= (indexToGo)) {
                return true;
            }
        }
    
    return false;
}