public void buyStoreProducts(java.lang.Boolean checkMax) {
    int maximum = pages.StorePanel.round;
    org.openqa.selenium.WebElement[] productsArray = getProductElements();
    if (checkMax == true) {
        maximum = setMaxBuy(getTotalProductsBought());
    }
    for (int i = 0; i < (productsArray.length); i++) {
        if ((getNumProductsBought(pages.StorePanel.productsBoughtId[i])) < maximum) {
            productsArray[i].click();
        }
    }
}