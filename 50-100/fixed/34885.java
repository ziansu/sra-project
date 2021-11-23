public java.lang.String getPredictionString() {
    ch.systemsx.sybit.crkwebui.shared.model.AssemblyScore score = null;
    for (ch.systemsx.sybit.crkwebui.shared.model.AssemblyScore as : assemblyScores) {
        if (as.getMethod().equals("eppic")) {
            score = as;
        }
    }
    if ((score == null) || ((score.getCallName()) == null)) {
        return "NOPRED";
    }
    return score.getCallName().toUpperCase();
}