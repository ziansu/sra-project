private int winningSound() {
    int rand = randomNumber();
    if ((rand % 2) == 0) {
        return R.raw.winning_point_1;
    }else
        if ((rand % 3) == 0) {
            return R.raw.wining_point_2;
        }else
            if ((rand % 5) == 0) {
                return R.raw.wining_point_3;
            }else {
                return R.raw.wining_point;
            }
        
    
}