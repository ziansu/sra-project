public java.lang.String getConfigurationJSON() {
    try {
        return de.jwic.controls.chart.impl.util.DataConverter.convertToJson(configuration, chartType);
    } catch (java.lang.Exception e) {
    }
    return "{}";
}