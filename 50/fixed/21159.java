public static void filters(java.util.List<io.restassured.filter.Filter> filters) {
    org.apache.commons.lang3.Validate.notNull(filters, "Filter list cannot be null");
    io.restassured.RestAssured.filters.addAll(filters);
}