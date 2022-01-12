private double calcRico(int ppmValue) {
    double teller = (((3 * 365) * (lines.size())) * (sumDDFTimesPPM(ppmValue))) - ((sumDDF()) * (sumPPM(ppmValue)));
    double noemer = ((lines.size()) * (sumDDFSquared())) - (sumDDFThenSquared());
    return teller / noemer;
}