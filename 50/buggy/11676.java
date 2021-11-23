public void initBroadPeaks() {
    for (cn.j1angvei.castk2.input.Experiment e : this.experiment) {
        if (broadPeaks.contains(e.getCode())) {
            e.setBroadPeak(true);
        }
    }
}