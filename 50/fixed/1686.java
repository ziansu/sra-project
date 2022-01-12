private RPGActor determineVictor(RPGActor a1, RPGActor a2) {
    if ((a1.getCurHp()) <= 0) {
        return a2;
    }else {
        return a1;
    }
}