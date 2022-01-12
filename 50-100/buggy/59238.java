public static int calculateDiscount(ooptraining.PassangerGroup pg) {
    int sum = 0;
    for (ooptraining.Passanger p : pg.getPassangers()) {
        sum += ooptraining.DiscountCalculator.getPassangerDiscount(p);
    }
    return sum / (pg.getPassangers().size());
}