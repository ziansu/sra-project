private double getRestLoanInYear(int afterNumberOfYears) {
    double K = property.getFinancialNeedsTotal();
    double T1 = (getRedemptionOfFirstYear()) + (getSpecialRedemptionEachYearAbsolut());
    double q = 1 + (interestRateNominalAsQuote());
    double qPowN = getQPowN((afterNumberOfYears + 1));
    double result = K - ((T1 * (qPowN - 1)) / (q - 1));
    return java.lang.Math.max(result, 0);
}