@org.testng.annotations.Test(priority = 10)
public void CheckErrorValidationForPayout() {
    appModules.Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
    appModules.Trading_Action.ValidateAmountField(driver, "Forex", "Payout");
    appModules.Trading_Action.NavigateToUpDownRiseFall(driver, "Commodities", "Gold/USD");
    appModules.Trading_Action.ValidateAmountField(driver, "Commodities", "Payout");
    appModules.Trading_Action.NavigateToUpDownRiseFall(driver, "Volatility Indices", "Volatility 100 Index");
    appModules.Trading_Action.ValidateAmountField(driver, "Volatility Indices", "Payout");
}