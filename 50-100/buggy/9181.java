private double getStepMovement(genetics.MusicPhenotype p) {
    double steps = 0;
    double intervalCount = 0;
    for (java.util.ArrayList<java.lang.Integer> measure : p.melodyIntervals) {
        for (int interval : measure) {
            interval = java.lang.Math.abs(interval);
            intervalCount++;
            if ((interval >= 1) || (interval <= 2)) {
                steps += 1;
            }
        }
    }
    if (intervalCount == 0) {
        return 0;
    }
    return steps / intervalCount;
}