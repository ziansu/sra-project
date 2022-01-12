public void checkRightPowerup() {
    switch (rightPowerup) {
        case 1 :
            if ((counter) == (rightEnd)) {
                leftMallet.stop = false;
                rightPowerup = -1;
            }
            break;
        case 2 :
            if ((counter) == (rightEnd)) {
                leftMallet.radius = leftMallet.defaultRadius;
                rightPowerup = -1;
            }
    }
}