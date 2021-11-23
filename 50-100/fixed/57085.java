private int winningSound() {
    int rand = randomNumber();
    if ((rand % 2) == 0) {
        return R.raw.wining_point;
    }else
        if ((rand % 3) == 0) {
            return R.raw.wining_point_2;
        }else {
            return R.raw.wining_point_3;
        }
    
}