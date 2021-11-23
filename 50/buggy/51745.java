public double getMolarMass() {
    double total = 0;
    for (ChemHelper.Ions ion : ions) {
        total += (ion.getNum()) * (ion.getMolarMass());
    }
    return total;
}