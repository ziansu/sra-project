public de.marsetex.lab2.task3.RationalNumber subtract(de.marsetex.lab2.task3.RationalNumber other) {
    if (other == null) {
        return null;
    }
    int zaehlerTemp = ((zaehler) * (other.nenner)) - ((other.zaehler) * (nenner));
    int nennerTemp = (nenner) * (other.nenner);
    return new de.marsetex.lab2.task3.RationalNumber(zaehlerTemp, nennerTemp);
}