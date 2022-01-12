private java.lang.String getRiskBucket(java.lang.String productName, com.github.vincent_fuchs.comprehensive_testing.model.CountryRating countryRating) {
    java.lang.String productVolatilityIndex = volatilityIndexService.getProductVolatilityIndex(productName);
    com.github.vincent_fuchs.comprehensive_testing.model.Risk volatilityIndexRisk = computeVolatilityIndexRisk(productVolatilityIndex);
    com.github.vincent_fuchs.comprehensive_testing.model.Risk countryRisk = computeCountryRisk(countryRating);
    return ((HIGH) == volatilityIndexRisk) || ((HIGH) == countryRisk) ? com.github.vincent_fuchs.comprehensive_testing.service.HIGH.toString() : ((MEDIUM) == volatilityIndexRisk) || ((MEDIUM) == countryRisk) ? com.github.vincent_fuchs.comprehensive_testing.service.MEDIUM.toString() : com.github.vincent_fuchs.comprehensive_testing.service.LOW.toString();
}