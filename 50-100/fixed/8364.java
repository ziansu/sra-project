public boolean setRedUpgrade() {
    if ((redBalls) < 5) {
        return false;
    }
    redBalls = (redBalls) - 5;
    if ((red) == null) {
        return true;
    }
    switch (red.getUpgradeType()) {
        case BALL_NUMBER_PLUS_1 :
            {
                break;
            }
        default :
            return false;
    }
    return false;
}