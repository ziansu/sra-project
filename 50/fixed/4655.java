int getDaysInMonthMaxForSet(long instant, int value) {
    return (value > 28) || (value < 1) ? getDaysInMonthMax(instant) : 28;
}