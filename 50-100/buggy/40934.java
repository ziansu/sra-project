public void update(int lane, int judge, int time, int fase) {
    if (judge < 5) {
        (notes)++;
    }
    if ((judge == 3) || (judge == 4)) {
        bga.setMisslayerTme(time);
    }
    gauge.update(judge);
    if (judge < 2) {
        lanerender.update(lane, judge, time);
    }
}