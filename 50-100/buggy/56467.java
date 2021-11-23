public static com.github.TKnudsen.timeseries.data.univariate.ITimeSeriesUnivariate loadConfigsFromFile(java.lang.String file) {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    com.github.TKnudsen.timeseries.data.univariate.ITimeSeriesUnivariate readValue;
    try {
        readValue = mapper.readValue(new java.io.File("ts.json"), com.github.TKnudsen.timeseries.data.univariate.TimeSeriesUnivariate.class);
        return readValue;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}