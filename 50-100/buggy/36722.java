public void buyStoreProducts(java.lang.Boolean checkMax) {
    org.openqa.selenium.WebElement[] productsArray = getProductElements();
    int maximum = pages.StorePanel.round;
    if (checkMax == true) {
        maximum = setMaxBuy(getTotalProductsBought());
    }
    for (int i = 0; i < (getProductElements().length); i++) {
        if ((getNumProductsBought(pages.StorePanel.productsBoughtId[i])) < maximum) {
            productsArray[i].click();
        }
    }
}