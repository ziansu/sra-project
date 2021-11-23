private double getSingleChance() {
    com.killpredictions.killexpectations.Calculations calc = new com.killpredictions.killexpectations.Calculations();
    return calc.calcExpHull(BS, str, 1, armV, is, rending, melta, twin_linked, Pref_Enemy, ordinance);
}