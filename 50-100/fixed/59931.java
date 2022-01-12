private void calculateMoney() {
    double workWeek = 0.28;
    double moneyEarnedLong = (((((lifeGained) * (salary)) * workWeek) / 365) / 24) / 60;
    moneyEarned = com.sebastianboyd.fitness.MainActivity.round(moneyEarnedLong, 2);
}