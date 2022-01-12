public void updateSavingsProductInterestRateCharts(java.util.Set<org.mifosplatform.portfolio.savings.domain.SavingsProductInterestRateChart> savingsProductInterestRateCharts) {
    if (savingsProductInterestRateCharts != null) {
        for (org.mifosplatform.portfolio.savings.domain.SavingsProductInterestRateChart interestRateChart : savingsProductInterestRateCharts) {
            interestRateChart.updateSavingsProduct(this);
        }
        this.savingsProductInterestRateCharts = savingsProductInterestRateCharts;
    }
}