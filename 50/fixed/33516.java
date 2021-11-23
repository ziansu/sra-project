@java.lang.Override
public java.util.Map findLocalitiesSummary() {
    java.lang.String requestParams = "?format=json";
    return apiService.findRawEntity("locality_summary", requestParams);
}