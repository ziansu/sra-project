@org.junit.Test
@junitparams.Parameters(value = { "45000, 600.00" , "50000, 766.67" , "60000, 1100.00" , "100000, 2433.33" , "105500, 2708.33" })
public void calculate_tax_payable_for_higher_rate_band(int annualGrossSalaryAmount, java.lang.String taxPayable) {
    es.rachelcarmena.domain.AnnualGrossSalary annualGrossSalary = new es.rachelcarmena.domain.AnnualGrossSalary(annualGrossSalaryAmount);
    org.junit.Assert.assertEquals(new es.rachelcarmena.domain.Amount(taxPayable), taxesCalculator.calculateTaxPayable(annualGrossSalary));
}