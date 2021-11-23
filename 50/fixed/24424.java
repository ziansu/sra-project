private boolean doTheAlcohol() {
    int bad = getChanceBadTime();
    int rand = ((int) (java.lang.Math.random())) * 100;
    return bad < rand;
}