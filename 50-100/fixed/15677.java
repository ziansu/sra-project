void move() {
    if ((falling) && ((startStealTime) == 0)) {
        if (((java.lang.System.currentTimeMillis()) - (createTime)) < (fallingDuration)) {
            if (((java.lang.System.currentTimeMillis()) - (lastSunMoveTime)) > (xyz.scottz.scottpz.Sun.timePerSunMove)) {
                lastSunMoveTime += xyz.scottz.scottpz.Sun.timePerSunMove;
                y += xyz.scottz.scottpz.Sun.distancePerSunMove;
                origY = y;
            }
        }
    }
}