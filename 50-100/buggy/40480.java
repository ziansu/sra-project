private void setNegatives(int type) {
    if ((type == (parohyapps.cardcounter.core.Game.DIAMONDS)) || (type == (parohyapps.cardcounter.core.Game.HEARTS))) {
        if (left) {
            leftCard *= -1;
            left = false;
        }else {
            rightCard *= -1;
            left = true;
        }
    }
}