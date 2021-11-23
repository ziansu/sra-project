public de.marsetex.lab2.task3.RationalNumber add(de.marsetex.lab2.task3.RationalNumber other) {
    int zaehlerTemp = ((zaehler) * (other.nenner)) + ((other.zaehler) * (nenner));
    int nennerTemp = (nenner) * (other.nenner);
    return new de.marsetex.lab2.task3.RationalNumber(zaehlerTemp, nennerTemp);
}