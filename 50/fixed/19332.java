private java.lang.Boolean hitOrMiss() {
    java.lang.Boolean hit;
    int roll = hitChance.roll();
    if (roll < (DangerTime.Player.HIT_CHANCE)) {
        hit = true;
    }else {
        hit = false;
    }
    return hit;
}