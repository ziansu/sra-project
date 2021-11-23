@org.junit.Test
public void return_generated_monthly_salary_slip_for_a_given_annual_salary() {
    SalarySlipKata.domain.Employee employee = new SalarySlipKata.domain.Employee(12345, "John J Doe", annualSalary);
    org.junit.Assert.assertThat(salarySlipApplication.generateFor(employee), org.hamcrest.CoreMatchers.is(salarySlip));
}