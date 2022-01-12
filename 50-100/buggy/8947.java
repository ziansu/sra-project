public boolean isAllValid(sss.domain.Product product) {
    return ((((isProductUnique(product)) && (isProductCodeValid(product))) && (isProductNameValid(product))) && (isCostPricePositive(product))) && (isPricePositive(product));
}