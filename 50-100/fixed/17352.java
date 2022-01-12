private double calcRico(int ppmValue) {
    double teller = (((3 * 365) * (lines.size())) * (sumDDFTimesPPM(ppmValue))) - ((sumDDF(ppmValue)) * (sumPPM(ppmValue)));
    double noemer = ((lines.size()) * (sumDDFSquared(ppmValue))) - (sumDDFThenSquared(ppmValue));
    return teller / noemer;
}