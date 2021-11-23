private double fillGPA(int completedYears, double total) {
    for (int i = completedYears; i < 4; i++) {
        total += 4.0 / (this.gpaRates[i]);
    }
    return total;
}