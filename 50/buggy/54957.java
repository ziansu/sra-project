private ver0.Actor determineVictor(ver0.Actor a1, ver0.Actor a2) {
    if ((a1.getCurHp()) == 0) {
        return a2;
    }else {
        return a1;
    }
}