public java.util.List<org.sonar.api.measures.Measure> buildFuncionMeasuresList(double complexMean, int complexityInFunctions, org.sonar.api.measures.RangeDistributionBuilder builder) {
    java.util.List<org.sonar.api.measures.Measure> list = new java.util.ArrayList<org.sonar.api.measures.Measure>();
    list.add(new org.sonar.api.measures.Measure(org.sonar.api.measures.CoreMetrics.FUNCTION_COMPLEXITY, complexMean));
    list.add(new org.sonar.api.measures.Measure(org.sonar.api.measures.CoreMetrics.COMPLEXITY_IN_FUNCTIONS).setIntValue(complexityInFunctions));
    list.add(builder.build().setPersistenceMode(PersistenceMode.MEMORY));
    return list;
}