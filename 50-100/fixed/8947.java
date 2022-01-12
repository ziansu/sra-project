public boolean isAllValid(sss.domain.Product product) {
    return (isProductCodeValid(product)) && ((((isProductUnique(product)) && (isProductNameValid(product))) && (isCostPricePositive(product))) && (isPricePositive(product)));
}