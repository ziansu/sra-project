protected void loseHearth() {
    if ((hearths.size()) > 0) {
        hearths.get(0).kill(((hearths.size()) - 1));
        hearths.remove(0);
    }
    if ((hearths.size()) <= 0) {
        firstPlan.remove();
        time = -1;
    }
}