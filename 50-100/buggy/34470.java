public boolean isCompleteAnimate() {
    java.lang.System.out.println((((((direction) + " ") + (currentIndex)) + " ") + (indexToGo)));
    if ((direction) > 0) {
        if ((currentIndex) > (indexToGo)) {
            return true;
        }
    }else
        if ((direction) < 0) {
            if ((currentIndex) < (indexToGo)) {
                return true;
            }
        }
    
    return false;
}