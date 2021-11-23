public int[] rowPrediction(int i) {
    java.lang.String t = info.get("Threshold");
    if (t != null) {
        return meka.core.ThresholdUtils.threshold(rowConfidence(i), t);
    }else {
        return meka.core.A.toIntArray(rowConfidence(i));
    }
}