@org.junit.Test
public void return_the_NI_contributions_for_a_given_range_and_rate_for_a_given_annual_salary() {
    final SalarySlipKata.domain.Money actualAnnualNIContributions = band.calculateFrom(annualSalary);
    final SalarySlipKata.domain.Money actualMonthlyNIContributions = actualAnnualNIContributions.divideBy(SalarySlipKata.domain.bands.BandShould.TWELVE_MONTHS);
    org.junit.Assert.assertThat(actualMonthlyNIContributions, org.hamcrest.CoreMatchers.is(expectedNIContributionsForABand));
}