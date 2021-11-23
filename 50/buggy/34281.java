public void updateSavingsProductInterestRateCharts(java.util.Set<org.mifosplatform.portfolio.savings.domain.SavingsProductInterestRateChart> savingsProductInterestRateCharts) {
    for (org.mifosplatform.portfolio.savings.domain.SavingsProductInterestRateChart interestRateChart : savingsProductInterestRateCharts) {
        interestRateChart.updateSavingsProduct(this);
    }
    this.savingsProductInterestRateCharts = savingsProductInterestRateCharts;
}