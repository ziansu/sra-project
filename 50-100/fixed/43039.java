private void setDimensions() {
    inputUnits = training.get(0).inputSeq[0].length;
    for (edu.insight.unlp.nn.common.Sequence seq : training) {
        for (double[] target : seq.target) {
            if (target != null) {
                outputUnits = target.length;
                break;
            }
        }
    }
}