public static double calculateDiscount(ooptraining.PassangerGroup pg) {
    double sum = 0;
    for (ooptraining.Passanger p : pg.getPassangers()) {
        sum += ooptraining.DiscountCalculator.getPassangerDiscount(p);
    }
    return sum == 0 ? 1.0 : sum / (pg.getPassangers().size());
}