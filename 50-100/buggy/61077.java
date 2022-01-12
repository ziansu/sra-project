private void fillDatabins(final org.matsim.contrib.analysis.kai.Databins<java.lang.String> databins) {
    java.util.SortedMap<java.lang.String, double[]> mode2distanceBasedLegs = distriInfo.getMode2DistanceBasedLegs();
    for (java.lang.String mode : mode2distanceBasedLegs.keySet()) {
        double[] distBasedLegs = mode2distanceBasedLegs.get(mode);
        for (int idx = 0; idx < (databins.getDataBoundaries().length); idx++) {
            databins.addValue(mode, idx, distBasedLegs[idx]);
        }
    }
}