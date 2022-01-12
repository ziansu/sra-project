@ru.yandex.qatools.allure.annotations.Features(value = "Финансовый контроль")
@ru.yandex.qatools.allure.annotations.Stories(value = "Финансовые показатели")
@org.testng.annotations.Test
public void financeTest() throws java.lang.InterruptedException {
    ru.fors.pages.FinControlPage finControlPage = new ru.fors.pages.FinControlPage(driver);
    finControlPage.userGoToFinancePage();
    finControlPage.waitForFinancePageLoaded();
    org.junit.Assert.assertTrue("Данные не сформировались за 1 минуту", finControlPage.isFinancePageFormed());
}