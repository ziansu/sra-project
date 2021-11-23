public double getMeanPower() {
    double mean = 0;
    int size = 0;
    if ((energyHistory) != null) {
        if (!(energyHistory.isEmpty())) {
            for (java.lang.Double d : energyHistory) {
                if (d > 0) {
                    mean += d;
                    size++;
                }
            }
            if (size != 0) {
                mean /= size;
                return mean;
            }
        }
    }
    return 0;
}