public boolean setRedUpgrade() {
    if ((redBalls) < 5) {
        return false;
    }
    redBalls = (redBalls) - 5;
    if ((red) == null) {
        red = new uk.org.ulcompsoc.ld32.components.Upgrade(uk.org.ulcompsoc.ld32.components.Upgrade.UpgradeType.BALL_NUMBER_PLUS_1);
        return true;
    }
    switch (red.getUpgradeType()) {
        case BALL_NUMBER_PLUS_1 :
            {
                red = new uk.org.ulcompsoc.ld32.components.Upgrade(uk.org.ulcompsoc.ld32.components.Upgrade.UpgradeType.BALL_NUMBER_PLUS_2);
                break;
            }
        default :
            return false;
    }
}