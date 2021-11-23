public java.lang.String getProductRisk(java.lang.String productName) {
    java.lang.String productCountry = productService.getProductCountry(productName);
    com.github.vincent_fuchs.comprehensive_testing.model.CountryRating countryRating = countryService.getRating(productCountry);
    return countryRating.isShouldOverride() ? computeCountryRisk(countryRating).toString() : getRiskBucket(productName, countryRating);
}