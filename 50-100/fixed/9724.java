public static void main(final java.lang.String[] args) throws java.lang.Exception {
    java.util.List<quickdt.Instance> diaInstances = quickdt.Benchmarks.loadDiabetesDataset();
    quickdt.Benchmarks.testWithInstances("diabetes", diaInstances);
    final java.util.List<quickdt.Instance> moboInstances = quickdt.Benchmarks.loadMoboDataset();
    quickdt.Benchmarks.testWithInstances("mobo", moboInstances);
}