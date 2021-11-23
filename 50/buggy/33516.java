@java.lang.Override
public java.util.Map findLocalitiesSummary() {
    java.lang.String requestParams = (ee.ttu.geocollection.interop.api.builder.details.FluentGeoApiDetailsBuilder.aRequest().buildWithDefaultReturningFields()) + "?format=json";
    return apiService.findRawEntity("locality_summary", requestParams);
}