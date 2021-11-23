@org.junit.runners.Parameterized.Parameters
public static java.lang.Object[] getParams() {
    java.util.List<nl.tue.comparison.TestEnvironment> environments = new java.util.ArrayList<>();
    nl.tue.comparison.ComparisonExecutor.addOnlyProvidedDatasets(environments);
    return environments.toArray();
}