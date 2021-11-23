public static java.util.Map<java.lang.String, java.util.regex.Pattern> getMapMetricsPattern() {
    if (((fr.cnes.sonarqube.plugins.framac.measures.CyclomaticMetrics.mapMetricsPattern) == null) || (fr.cnes.sonarqube.plugins.framac.measures.CyclomaticMetrics.mapMetricsPattern.isEmpty())) {
        fr.cnes.sonarqube.plugins.framac.measures.CyclomaticMetrics.initMapMetricsPattern();
    }
    return fr.cnes.sonarqube.plugins.framac.measures.CyclomaticMetrics.mapMetricsPattern;
}