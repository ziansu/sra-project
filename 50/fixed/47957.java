@io.qameta.allure.Step(value = "Click on link in table and open page")
public void clickOnTheLink(java.lang.String row, java.lang.String link) {
    table.clickOnTheLinkBy(row, link);
}