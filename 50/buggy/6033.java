private SalarySlipKata.domain.GBP perMonth(SalarySlipKata.domain.GBP value) {
    return new SalarySlipKata.domain.GBP(value.divideBy(SalarySlipKata.application_service.SalarySlipApplication.TWELVE_MONTHS));
}