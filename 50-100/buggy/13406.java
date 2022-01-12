private double getMinY(java.util.Date dob, int minAge, org.opensrp.api.constants.Gender gender) {
    double minY = org.ei.opensrp.path.domain.ZScore.reverse(gender, minAge, (-3.0));
    java.util.Calendar minWeighingDate = getMinWeighingDate(dob);
    java.util.Calendar maxWeighingDate = getMaxWeighingDate(dob);
    for (org.ei.opensrp.domain.Weight curWeight : weights) {
        if (isWeightOkToDisplay(minWeighingDate, maxWeighingDate, curWeight)) {
            if ((curWeight.getKg()) < minY) {
                minY = curWeight.getKg();
            }
        }
    }
    return minY;
}