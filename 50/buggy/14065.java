public static float calculateVariance(kr.ac.kaist.ic.arSkelecton.sensorProc.DataInstance di) {
    return kr.ac.kaist.ic.arSkelecton.sensorProc.FeatureGenerator.calculateMin(di.getValues());
}