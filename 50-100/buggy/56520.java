public boolean posNeg(int a, int b, boolean negative) {
    if (((negative == true) && (a < 0)) && (b < 0)) {
        return true;
    }else
        if (((a > 0) && (b < 0)) || ((b > 0) && (a < 0))) {
            return true;
        }else {
            return false;
        }
    
}