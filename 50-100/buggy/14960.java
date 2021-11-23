public void selectAnyCategory() {
    colapseCategories();
    this.moveToElementAndClick(categoryMenuLink);
    populateCategoryItems();
    this.waitForJQueryToComplete();
    this.waitForJavaScriptToComplete();
    int random = randomSelect(departments.size());
    org.openqa.selenium.WebElement element = departments.get(random).findElement(org.openqa.selenium.By.className("subFacetListTxt"));
    this.moveToElementAndClick(element);
    this.waitUntilElementIsHide(element);
}