int getDaysInMonthMaxForSet(long instant, int value) {
    return value > 28 ? getDaysInMonthMax(instant) : 28;
}