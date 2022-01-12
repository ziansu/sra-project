private double getMaxY(java.util.Date dob, int maxAge, org.opensrp.api.constants.Gender gender) {
    double maxY = org.ei.opensrp.path.domain.ZScore.reverse(gender, maxAge, 3.0);
    java.util.Calendar minWeighingDate = getMinWeighingDate(dob);
    java.util.Calendar maxWeighingDate = getMaxWeighingDate(dob);
    for (org.ei.opensrp.domain.Weight curWeight : weights) {
        if (isWeightOkToDisplay(minWeighingDate, maxWeighingDate, curWeight)) {
            if ((curWeight.getKg()) > maxY) {
                maxY = curWeight.getKg();
            }
        }
    }
    return maxY;
}