public int getMult(int a) {
    double b = (difficulty.getMult()) * (currentStage.getMult());
    return ((int) (java.lang.Math.round((b * a))));
}