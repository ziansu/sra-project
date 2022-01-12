private void checkSearchResult(java.lang.String str) throws java.lang.Exception {
    mainPage.typeInSearchField("Nig");
    org.openqa.selenium.WebElement searchCount = new org.openqa.selenium.support.ui.WebDriverWait(driver, 10).until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(mainPage.getSearchCountLocator()));
    if ((java.lang.Integer.parseInt(searchCount.getText())) == 0) {
        throw new java.lang.Exception("Result counter equals to 0.");
    }
}