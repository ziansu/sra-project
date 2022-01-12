private au.edu.cmu.algorithm.Histogram.Interval[] setFrequencies(int[] data, au.edu.cmu.algorithm.Histogram.Interval[] histogram) {
    for (int i = 0; i < (data.length); i++) {
        int currentData = data[i];
        for (au.edu.cmu.algorithm.Histogram.Interval interval : histogram) {
            double lowerbound = interval.lowerbound;
            double upperbound = interval.upperbound;
            if ((currentData >= lowerbound) && (currentData < upperbound)) {
                (interval.frequency)++;
                break;
            }
        }
    }
    return histogram;
}