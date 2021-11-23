public double getMeanPower() {
    double mean = 0;
    if ((energyHistory) != null) {
        if (!(energyHistory.isEmpty())) {
            for (java.lang.Double d : energyHistory) {
                mean += d;
            }
            int size = energyHistory.size();
            if (size != 0) {
                mean /= size;
                return mean;
            }
        }
    }
    return 0;
}