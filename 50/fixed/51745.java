public double getMolarMass() {
    double total = 0;
    for (ChemHelper.Ions ion : ions) {
        total += ion.getMolarMass();
    }
    return total;
}