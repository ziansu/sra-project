@com.common.test.Test
public void testTicker() {
    com.week2.solution.ticker.Company adidas = new com.week2.solution.ticker.Company("Adidas", 301);
    com.week2.solution.ticker.Company fake = new com.week2.solution.ticker.Company();
    com.week2.solution.ticker.Company google = new com.week2.solution.ticker.Company("Google");
    com.week2.solution.ticker.Company unknown = new com.week2.solution.ticker.Company(501.2);
    adidas.changeStockPrice(401.5);
    fake.changeStockPrice(2);
    google.changeStockPrice(687);
    unknown.changeStockPrice(1);
    adidas.changeStockPrice(24);
}