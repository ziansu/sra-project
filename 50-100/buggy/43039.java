private void setDimensions() {
    inputUnits = training.get(0).inputSeq[0].length;
    for (edu.insight.unlp.nn.common.Sequence seq : training) {
        if ((seq.target) != null) {
            outputUnits = seq.target[0].length;
            break;
        }
    }
}