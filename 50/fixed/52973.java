private double getSingleChance() {
    com.killpredictions.killexpectations.Calculations calc = new com.killpredictions.killexpectations.Calculations();
    return calc.calcExpHull(BS, str, 1, armV, is, melta, twin_linked, rending, Pref_Enemy, ordinance);
}